package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.hassaan.leadcrm.Activities.AddContactsActivity;
import com.example.hassaan.leadcrm.Activities.AddDealsActivity;
import com.example.hassaan.leadcrm.R;

public class DealsFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    public String[] sample={"Red","Blue","Green","Yellow","White","Black","Orange","Purple","Blue","Pink"};
    SearchView searchView;
    Spinner spinner;

    public DealsFragment() {
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
        View view = inflater.inflate(R.layout.fragment_deals, container, false);

        searchView = view.findViewById(R.id.searchDeals);
        searchView.setQueryHint("Search...");
        searchView.onActionViewExpanded();

        spinner = view.findViewById(R.id.spinnerDeals);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,sample);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        FloatingActionButton fab = view.findViewById(R.id.fbDeals);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddDealsActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
