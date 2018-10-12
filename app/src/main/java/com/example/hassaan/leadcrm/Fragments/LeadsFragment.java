package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.hassaan.leadcrm.Activities.AddLeadActivity;
import com.example.hassaan.leadcrm.Adapters.LeadListViewAdapter;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class LeadsFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    //public String[] sample={"Red","Blue","Green","Yellow","White","Black","Orange","Purple","Blue","Pink"};

    private List<String> list=new ArrayList<String>();
    private Context context;

    ExpandableStickyListHeadersListView expandableStickyList;


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
        View view=inflater.inflate(R.layout.fragment_leads, container, false);
        getsampledata();

        expandableStickyList = (ExpandableStickyListHeadersListView) view.findViewById(R.id.listView_leads);
        StickyListHeadersAdapter adapter = new LeadListViewAdapter(getContext(),list);
        expandableStickyList.setAdapter(adapter);
        expandableStickyList.setOnHeaderClickListener(new StickyListHeadersListView.OnHeaderClickListener() {
            @Override
            public void onHeaderClick(StickyListHeadersListView l, View header, int itemPosition, long headerId, boolean currentlySticky) {
                if(expandableStickyList.isHeaderCollapsed(headerId)){
                    expandableStickyList.expand(headerId);
                }else {
                    expandableStickyList.collapse(headerId);
                }
            }
        });

        //((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.floating_leads);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),AddLeadActivity.class);
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

    public void getsampledata() {
        //public String[] sample={"Red","Blue","Green","Yellow","White","Black","Orange","Purple","Blue","Pink"};
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("White");
        list.add("Black");
        list.add("Orange");
        list.add("Purple");
        list.add("Blue");
        list.add("Pink");
        java.util.Collections.sort(list);
    }
}
