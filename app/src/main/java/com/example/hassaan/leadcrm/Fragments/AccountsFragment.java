package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hassaan.leadcrm.Activities.AddAccountActivity;
import com.example.hassaan.leadcrm.Activities.AddEventActivity;
import com.example.hassaan.leadcrm.R;


public class AccountsFragment extends Fragment {

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
}
