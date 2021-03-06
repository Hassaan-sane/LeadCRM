package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.hassaan.leadcrm.Activities.AddLeadActivity;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.RecyclerViews.LeadsRecycler;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.TableClasses.Leads;

import java.util.ArrayList;
import java.util.List;

public class LeadsFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    public String[] sample = {"Red", "Blue", "Green", "Yellow", "White", "Black", "Orange", "Purple", "Blue", "Pink"};
    private List<String> list = new ArrayList<String>();
    private List<Leads> Leadlist = new ArrayList<>();
    Spinner spinner;
    private Context context = getContext();


    public LeadsFragment() {
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
        View view = inflater.inflate(R.layout.fragment_leads, container, false);
        spinner = view.findViewById(R.id.spinner_leads);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, sample);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        LeadsRepo leadsRepo = new LeadsRepo();

        Leadlist=leadsRepo.getLeadsList();

        RecyclerView recyclerView = view.findViewById(R.id.recycler_leads);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new LeadsRecycler(Leadlist, getActivity()));

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.floating_leads);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddLeadActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ((TextView) parent.getChildAt(0)).setTextColor(getResources().getColor(R.color.colorPrimary));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
