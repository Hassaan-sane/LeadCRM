package com.example.hassaan.leadcrm.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hassaan.leadcrm.R;

public class AddTaskActivity extends AppCompatActivity {
    //TextView tv_subject_task, tv_ownerName_Task, tv_dueDate_Task, tv_priority_Task, tv_status_Task;
    EditText et_subject_task, et_ownerName_Task, et_dueDate_Task, et_priority_Task, et_status_Task;

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
        et_priority_Task = findViewById(R.id.et_priority_Task);
        et_status_Task = findViewById(R.id.et_status_Task);


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
            Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show();
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
