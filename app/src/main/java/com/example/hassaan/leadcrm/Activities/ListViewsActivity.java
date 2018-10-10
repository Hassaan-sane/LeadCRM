package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private  List<String> list=new ArrayList<>();
    ListView listView;
    private ArrayAdapter<String> listAdapter;
    private String pressedbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=(ListView) findViewById(R.id.listview);

        list=getIntent().getStringArrayListExtra("list");
        pressedbutton=getIntent().getStringExtra("Button");
        listAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        int duration = 500;  //miliseconds
        int offset = 0;      //fromListTop
        ((TextView) parent.getChildAt(position)).setTextColor(getResources().getColor(R.color.colorPrimary));
        Intent intent=new Intent(this,AddLeadActivity.class);
        intent.putExtra("Selected Position",position);
        intent.putExtra("Button",pressedbutton);
        Log.e("Position",position+"");
        Log.e("Position",pressedbutton);
        finish();

    }
}