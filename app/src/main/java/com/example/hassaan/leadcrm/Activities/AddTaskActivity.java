package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Task;

import java.util.Calendar;

public class AddTaskActivity extends AppCompatActivity {
    //TextView tv_subject_task, tv_ownerName_Task, tv_dueDate_Task, tv_priority_Task, tv_status_Task;
    EditText et_subject_task, et_ownerName_Task, et_dueDate_Task;
    Button  btn_priority_Task, btn_status_Task;

    private int IndexValue_status=-1, IndexValue_priority=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

//        tv_subject_task = findViewById(R.id.tv_Subject_task);
//        tv_ownerName_Task = findViewById(R.id.tv_ownerName_Task);
//        tv_dueDate_Task = findViewById(R.id.tv_dueDate_Task);
//        tv_priority_Task = findViewById(R.id.tv_priority_Task);
//        tv_status_Task = findViewById(R.id.tv_status_Task);


        et_subject_task = findViewById(R.id.et_Subject_task);
        et_ownerName_Task = findViewById(R.id.et_ownerName_Task);
        et_dueDate_Task = findViewById(R.id.et_dueDate_Task);

        btn_priority_Task = findViewById(R.id.btn_priority_Task);
        btn_status_Task = findViewById(R.id.btn_status_Task);

        btn_priority_Task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddTaskActivity.this,ListSelectActivity.class);
                startActivityForResult(intent,1);
            }
        });

        btn_status_Task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddTaskActivity.this,ListSelectActivity.class);
                intent.putExtra("Code",2);
                startActivityForResult(intent,2);
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
                btn_status_Task.setText(Status);
            }
        }
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                IndexValue_priority = data.getIntExtra("index", -1);
                String Status = data.getStringExtra("Button");
                Toast.makeText(AddTaskActivity.this, "item clicked "+IndexValue_priority, Toast.LENGTH_SHORT).show();
                btn_priority_Task.setText(Status);
            }
        }

    }

    private boolean validate(){

        boolean bool= true;
        if(et_subject_task.length()==0){
            et_subject_task.setError("This Field is Required");
            bool=false;
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
            if(bool==false){
                Toast.makeText(this, "Please Fill the fields First", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();

                TaskRepo taskRepo= new TaskRepo();
                Task task = new Task();

                task.setOwnerName("Hassaan");
                task.setSubject(et_subject_task.getText().toString());
                task.setDueDate(Calendar.getInstance().getTime());
                task.setPriorityID(IndexValue_priority);
                task.setStatusID(IndexValue_status);

                taskRepo.insertInTask(task);

                finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

}
