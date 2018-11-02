package com.example.hassaan.leadcrm.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.RecyclerViews.PriorityRecycler;
import com.example.hassaan.leadcrm.RecyclerViews.StatusRecycler;

import static com.example.hassaan.leadcrm.app.getContext;

public class ListSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_select);
        if (getIntent() != null) {

            if (getIntent().getIntExtra("Code", 0) == 2) {
                RecyclerView recyclerView = findViewById(R.id.recycler_listSelect);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerView.setAdapter(new StatusRecycler(getApplicationContext()));
            }
            else {
                RecyclerView recyclerView = findViewById(R.id.recycler_listSelect);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerView.setAdapter(new PriorityRecycler(getApplicationContext()));
            }
        }
    }

}
