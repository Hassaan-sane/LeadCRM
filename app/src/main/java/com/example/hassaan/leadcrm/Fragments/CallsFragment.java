package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.hassaan.leadcrm.Activities.AddCallActivity;
import com.example.hassaan.leadcrm.Activities.AddContactsActivity;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.RecyclerViews.AccountsRecycler;
import com.example.hassaan.leadcrm.RecyclerViews.CallsRecycler;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    public String[] sample={"Red","Blue","Green","Yellow","White","Black","Orange","Purple","Blue","Pink"};
    private List<String> list=new ArrayList<String>();
    SearchView searchView;
    Spinner spinner;


    public CallsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);


        searchView = view.findViewById(R.id.searchcalls);
        searchView.setQueryHint("Search...");
        searchView.onActionViewExpanded();

        spinner = view.findViewById(R.id.spinnercalls);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,sample);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        list.add("Red\n\n\n\n\n\n\n");
        list.add("Blue\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        list.add("Green\n\n\n\n\n\n");
        list.add("Yellow\n\n\n\n\n\n");



        RecyclerView recyclerView=view.findViewById(R.id.recyclercalls);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new CallsRecycler(list));



        FloatingActionButton fab = view.findViewById(R.id.fbCall);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddCallActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
