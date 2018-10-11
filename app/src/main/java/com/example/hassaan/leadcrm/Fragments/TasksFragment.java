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
import android.widget.SearchView;

import com.example.hassaan.leadcrm.Activities.AddTaskActivity;
import com.example.hassaan.leadcrm.R;

public class TasksFragment extends Fragment {

    SearchView searchView;

    public TasksFragment() {
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
        View view = inflater.inflate(R.layout.fragment_tasks, container, false);

        searchView = view.findViewById(R.id.searchViewTask);
        searchView.setQueryHint("Search View");
        searchView.onActionViewExpanded();

        FloatingActionButton fab = view.findViewById(R.id.floating_Task);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddTaskActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
