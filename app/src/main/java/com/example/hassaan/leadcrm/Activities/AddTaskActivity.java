package com.example.hassaan.leadcrm.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;

public class AddTaskActivity extends AppCompatActivity {
    TextView tv_subject_task, tv_ownerName_Task, tv_dueDate_Task, tv_priority_Task, tv_status_Task;
    EditText et_subject_task, et_ownerName_Task, et_dueDate_Task, et_priority_Task, et_status_Task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        tv_subject_task = findViewById(R.id.tv_Subject_task);
        tv_ownerName_Task = findViewById(R.id.tv_ownerName_Task);
        tv_dueDate_Task = findViewById(R.id.tv_dueDate_Task);
        tv_priority_Task = findViewById(R.id.tv_priority_Task);
        tv_status_Task = findViewById(R.id.tv_status_Task);


        et_subject_task = findViewById(R.id.et_Subject_task);
        et_ownerName_Task = findViewById(R.id.et_ownerName_Task);
        et_dueDate_Task = findViewById(R.id.et_dueDate_Task);
        et_priority_Task = findViewById(R.id.et_priority_Task);
        et_status_Task = findViewById(R.id.et_status_Task);


    }
}
