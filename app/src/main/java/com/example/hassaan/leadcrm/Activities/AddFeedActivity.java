package com.example.hassaan.leadcrm.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hassaan.leadcrm.R;

public class AddFeedActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_addfeed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_feed);
        btn_addfeed=findViewById(R.id.bt_addfeed_feed);
        btn_addfeed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        finish();
    }
}
