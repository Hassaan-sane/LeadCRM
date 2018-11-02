package com.example.hassaan.leadcrm.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Task;

import org.w3c.dom.Text;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TaskDetailsFragment extends Fragment {

    TextView tv_subject_taskDetails, tv_ownerName_TaskDetails, tv_dueDate_TaskDetails, tv_priority_TaskDetails, tv_status_TaskDetails;

    List<Task> taskList;
    public TaskDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_task_details, container, false);
        createReferences(view);

        if(getArguments()!=null){
            TaskRepo taskRepo = new TaskRepo();
            taskList=taskRepo.getTaskList();
            int getArgument = getArguments().getInt("TaskPosition");

            Toast.makeText(getContext(), ""+getArgument, Toast.LENGTH_SHORT).show();
            tv_subject_taskDetails.setText(taskList.get(getArgument).getSubject());
            tv_priority_TaskDetails.setText(taskList.get(getArgument).getPriorityID().toString());
            tv_ownerName_TaskDetails.setText(taskList.get(getArgument).getOwnerName());
            tv_status_TaskDetails.setText(taskList.get(getArgument).getStatusID().toString());

            Toast.makeText(getContext(), "Priority "+taskList.get(getArgument).getPriorityID(), Toast.LENGTH_SHORT).show();

        }


        return view;
    }

    private void createReferences(View view) {
        tv_subject_taskDetails = view.findViewById(R.id.tv_Subject_taskDetails);
        tv_ownerName_TaskDetails = view.findViewById(R.id.tv_ownerName_TaskDetails);
        tv_dueDate_TaskDetails = view.findViewById(R.id.tv_dueDate_TaskDetails);
        tv_priority_TaskDetails = view.findViewById(R.id.tv_priority_TaskDetails);
        tv_status_TaskDetails = view.findViewById(R.id.tv_status_TaskDetails);
    }

}
