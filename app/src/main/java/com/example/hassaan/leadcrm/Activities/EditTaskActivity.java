package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Task;

import java.util.Calendar;
import java.util.List;

public class EditTaskActivity extends AppCompatActivity {
    //TextView tv_subject_taskEdit, tv_ownerName_TaskEdit, tv_dueDate_TaskEdit, tv_priority_TaskEdit, tv_status_TaskEdit;
    EditText et_subject_taskEdit, et_ownerName_TaskEdit, et_dueDate_TaskEdit;
    Button btn_priority_TaskEdit, btn_status_TaskEdit;

    private int IndexValue_status = -1, IndexValue_priority = -1;

    private int TaskPosition;
    private List<Task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);

//        tv_subject_taskEdit = findViewById(R.id.tv_Subject_taskEdit);
//        tv_ownerName_TaskEdit = findViewById(R.id.tv_ownerName_TaskEdit);
//        tv_dueDate_TaskEdit = findViewById(R.id.tv_dueDate_TaskEdit);
//        tv_priority_TaskEdit = findViewById(R.id.tv_priority_TaskEdit);
//        tv_status_TaskEdit = findViewById(R.id.tv_status_TaskEdit);


        et_subject_taskEdit = findViewById(R.id.et_Subject_taskEdit);
        et_ownerName_TaskEdit = findViewById(R.id.et_ownerName_TaskEdit);
        et_dueDate_TaskEdit = findViewById(R.id.et_dueDate_TaskEdit);

        btn_priority_TaskEdit = findViewById(R.id.btn_priority_TaskEdit);
        btn_status_TaskEdit = findViewById(R.id.btn_status_TaskEdit);

        if (getIntent() != null) {
            TaskPosition = getIntent().getIntExtra("TaskPosition", 0);
            ;

            TaskRepo taskRepo = new TaskRepo();
            taskList = taskRepo.getTaskList();

            et_subject_taskEdit.setText(taskList.get(TaskPosition).getSubject());
            et_ownerName_TaskEdit.setText(taskList.get(TaskPosition).getOwnerName());
            btn_priority_TaskEdit.setText(taskList.get(TaskPosition).getPriorityID().toString());
            btn_status_TaskEdit.setText(taskList.get(TaskPosition).getStatusID().toString());
            IndexValue_priority = taskList.get(TaskPosition).getPriorityID();
            IndexValue_status = taskList.get(TaskPosition).getStatusID();
        }

        btn_priority_TaskEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditTaskActivity.this, ListSelectActivity.class);
                startActivityForResult(intent, 1);
            }
        });

        btn_status_TaskEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditTaskActivity.this, ListSelectActivity.class);
                intent.putExtra("Code", 2);
                startActivityForResult(intent, 2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                IndexValue_status = data.getIntExtra("index", -1);
                String Status = data.getStringExtra("Button");
                btn_status_TaskEdit.setText(Status);
            }
        }
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                IndexValue_priority = data.getIntExtra("index", -1);
                String Status = data.getStringExtra("Button");
                Toast.makeText(EditTaskActivity.this, "item clicked " + IndexValue_priority, Toast.LENGTH_SHORT).show();
                btn_priority_TaskEdit.setText(Status);
            }
        }

    }

    private boolean validate() {

        boolean bool = true;
        if (et_subject_taskEdit.length() == 0) {
            et_subject_taskEdit.setError("This Field is Required");
            bool = false;
        }
        if (et_ownerName_TaskEdit.length() == 0) {
            et_ownerName_TaskEdit.setError("This Field is Required");
            bool = false;
        }
        return bool;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ok_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.ok) {
            boolean bool = validate();
            if (bool == false) {
                Toast.makeText(this, "Please Fill the fields First", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();

                TaskRepo taskRepo = new TaskRepo();
                Task task = new Task();

                task.setID(taskList.get(TaskPosition).getID());
                task.setOwnerName(et_ownerName_TaskEdit.getText().toString());
                task.setSubject(et_subject_taskEdit.getText().toString());
                task.setDueDate(Calendar.getInstance().getTime());
                task.setPriorityID(IndexValue_priority);
                task.setStatusID(IndexValue_status);

                taskRepo.updateTask(task);

                finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

}
