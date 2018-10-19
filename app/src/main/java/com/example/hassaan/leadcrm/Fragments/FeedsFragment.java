package com.example.hassaan.leadcrm.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hassaan.leadcrm.Activities.AddFeedActivity;
import com.example.hassaan.leadcrm.RecyclerViews.FeedRecycler;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class FeedsFragment extends Fragment {

    public FeedsFragment() {
        // Required empty public constructor
    }
    private List<String> list=new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_feeds, container, false);

        list.add("Red\n\n\n\n\n\n\n");
        list.add("Blue\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        list.add("Green\n\n\n\n\n\n");
        list.add("Yellow\n\n\n\n\n\n");



        RecyclerView recyclerView=view.findViewById(R.id.recycler_feeds);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new FeedRecycler(list));

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.floating_feeds);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),AddFeedActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
