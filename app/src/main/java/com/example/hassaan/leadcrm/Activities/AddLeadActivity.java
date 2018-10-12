package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hassaan.leadcrm.Fragments.LeadsFragment;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class AddLeadActivity extends AppCompatActivity implements View.OnClickListener{

    Button leadsource, industry;

    private List<String> list=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lead);

        leadsource=findViewById(R.id.bt_leadSource_lead);
        industry=findViewById(R.id.bt_industry_lead);
        leadsource.setOnClickListener(this);
        industry.setOnClickListener(this);
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Log.e("Position onResume","On Resume");
        int value=getIntent().getIntExtra("Selected Position",-1);
        Log.e("Position onResume",value+"");
//        if(value!=-1){
//            Log.e("Position onStart",value+"");
//            if(getIntent().getStringExtra("Button").equals("LeadSource")){
//                leadsource.setText(list.get(value));
//            }
//            else if(getIntent().getStringExtra("Button").equals("Industry")){
//                industry.setText(list.get(value));
//            }
//        }
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,ListViewsActivity.class);
        if(v.getId()==R.id.bt_leadSource_lead)
        {
            intent.putStringArrayListExtra("list", (ArrayList<String>) list);
            intent.putExtra("Button","LeadSource");
        }
        else if(v.getId()==R.id.bt_industry_lead)
        {
            intent.putStringArrayListExtra("list", (ArrayList<String>) list);
            intent.putExtra("Button","Industry");
        }
        startActivity(intent);
    }
}
