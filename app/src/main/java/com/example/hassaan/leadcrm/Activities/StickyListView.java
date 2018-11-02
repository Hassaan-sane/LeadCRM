package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.hassaan.leadcrm.Adapters.LeadListViewAdapter;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class StickyListView extends AppCompatActivity {

    private List<String> list=new ArrayList<String>();
    private String buttonName;
    ExpandableStickyListHeadersListView expandableStickyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticky_list_view);

        list=getIntent().getStringArrayListExtra("list");
        buttonName=getIntent().getStringExtra("Button");

        expandableStickyList = findViewById(R.id.listView_default);
        StickyListHeadersAdapter adapter = new LeadListViewAdapter(this,list);
        expandableStickyList.setAdapter(adapter);
        expandableStickyList.setOnHeaderClickListener(new StickyListHeadersListView.OnHeaderClickListener() {
            @Override
            public void onHeaderClick(StickyListHeadersListView l, View header, int itemPosition, long headerId, boolean currentlySticky) {
                if(expandableStickyList.isHeaderCollapsed(headerId)){
                    expandableStickyList.expand(headerId);
                }else {
                    expandableStickyList.collapse(headerId);
                }
            }
        });

        expandableStickyList.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.putExtra("index",i);
                intent.putExtra("Button",buttonName);
//                Log.e("index",""+i);
//                Log.e("Button",buttonName);
                setResult(RESULT_OK, intent);
                finish();
                //Toast.makeText(StickyListView.this, "item clicked "+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
