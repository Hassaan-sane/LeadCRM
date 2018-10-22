package com.example.hassaan.leadcrm.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.RecyclerViews.NoteRecycler;
import com.example.hassaan.leadcrm.RecyclerViews.TaskRecycler;
import com.example.hassaan.leadcrm.Repo.NoteRepo;
import com.example.hassaan.leadcrm.TableClasses.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CallRelatedFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CallRelatedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CallRelatedFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private List<String> list = new ArrayList<String>();
    private List<Note> listNote = new ArrayList<>();

    Button btn_add_note_call, btn_add_task_call, btn_add_attachment_call;


    public CallRelatedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CallRelatedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CallRelatedFragment newInstance(String param1, String param2) {
        CallRelatedFragment fragment = new CallRelatedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_call_related, container, false);

        NoteRepo noteRepo= new NoteRepo();
        btn_add_note_call = view.findViewById(R.id.btn_add_note_call);
        btn_add_attachment_call = view.findViewById(R.id.btn_add_attachment_call);
        btn_add_task_call = view.findViewById(R.id.btn_add_task_call);

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        listNote = noteRepo.getNoteList();

        RecyclerView recyclerView = view.findViewById(R.id.TaskCallRelatedRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new TaskRecycler(list, getContext()));

        recyclerView.setNestedScrollingEnabled(false);

        RecyclerView recyclerView1 = view.findViewById(R.id.NoteCallRelatedRecyclerView);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView1.setAdapter(new NoteRecycler(listNote, getContext()));

        recyclerView1.setNestedScrollingEnabled(false);

        RecyclerView recyclerView2 = view.findViewById(R.id.AttachmentCallRelatedRecyclerView);
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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
