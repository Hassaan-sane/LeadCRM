package com.example.hassaan.leadcrm.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.RecyclerViews.NoteRecycler;
import com.example.hassaan.leadcrm.RecyclerViews.TaskRecycler;
import com.example.hassaan.leadcrm.TableClasses.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoteFragment extends Fragment {

    private List<Note> list= new ArrayList<>();


    public NoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_note, container, false);


//        list.add("Red");
//        list.add("Blue");
//        list.add("Green");
//        list.add("Yellow");
//        list.add("Red");
//        list.add("Blue");
//        list.add("Green");
//        list.add("Yellow");
//        list.add("Red");
//        list.add("Blue");
//        list.add("Green");
//        list.add("Yellow");
//
//
//        RecyclerView recyclerView=view.findViewById(R.id.note_recy);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setAdapter(new NoteRecycler(list,getContext()));

        return view;
    }

}
