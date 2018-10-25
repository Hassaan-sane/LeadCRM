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
import android.widget.TextView;

import com.example.hassaan.leadcrm.Activities.AddAccountActivity;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.RecyclerViews.AccountsRecycler;
import com.example.hassaan.leadcrm.Repo.AccountsRepo;
import com.example.hassaan.leadcrm.TableClasses.Account;

import java.util.ArrayList;
import java.util.List;


public class AccountsFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    public String[] sample={"Red","Blue","Green","Yellow","White","Black","Orange","Purple","Blue","Pink"};
    private List<Account> list= new ArrayList<>();
    SearchView searchView;
    Spinner spinner;
    public AccountsFragment() {
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
        View view=inflater.inflate(R.layout.fragment_accounts, container, false);
        searchView = view.findViewById(R.id.searchAccounts);
        searchView.setQueryHint("Search...");
        searchView.onActionViewExpanded();

        spinner = view.findViewById(R.id.spinnerAccounts);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,sample);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
//
//        list.add("Red\n\n\n\n\n\n\n");
//        list.add("Blue\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//        list.add("Green\n\n\n\n\n\n");
//        list.add("Yellow\n\n\n\n\n\n");

        AccountsRepo accountsRepo = new AccountsRepo();
        list=accountsRepo.getAccountShortList();

        RecyclerView recyclerView=view.findViewById(R.id.recyclerAccounts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new AccountsRecycler(list,getContext()));

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.floating_accounts);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),AddAccountActivity.class);
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
