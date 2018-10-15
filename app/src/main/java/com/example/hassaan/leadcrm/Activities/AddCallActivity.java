package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class AddCallActivity extends AppCompatActivity implements View.OnClickListener{


    private List<String> list=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_calls);


        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
    }

    @Override
    public void onClick(View v) {

    }
}
