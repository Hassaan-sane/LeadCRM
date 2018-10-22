package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.RecyclerViews.TaskRecycler;

import java.util.ArrayList;
import java.util.List;


public class LeadRelatedFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private List<String> list = new ArrayList<String>();

    Button btn_add_task, btn_add_attachment;

    public LeadRelatedFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lead_related, container, false);

        btn_add_attachment = view.findViewById(R.id.btn_add_attachment);
        btn_add_task = view.findViewById(R.id.btn_add_task);

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        RecyclerView recyclerView = view.findViewById(R.id.TaskLeadRelatedRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new TaskRecycler(list, getContext()));

        recyclerView.setNestedScrollingEnabled(false);

        RecyclerView recyclerView2 = view.findViewById(R.id.AttachmentLeadRelatedRecyclerView);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView2.setAdapter(new TaskRecycler(list, getContext()));

        recyclerView2.setNestedScrollingEnabled(false);


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
