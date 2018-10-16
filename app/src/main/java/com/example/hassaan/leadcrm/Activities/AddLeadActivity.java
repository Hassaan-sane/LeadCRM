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
import android.widget.Toast;

import com.example.hassaan.leadcrm.Fragments.LeadsFragment;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class AddLeadActivity extends AppCompatActivity implements View.OnClickListener{

    Button leadsource, industry;

    private List<String> list=new ArrayList<String>();

    private String buttonName;

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
        list.add("Black");
        java.util.Collections.sort(list);
    }


    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,StickyListView.class);
        if(v.getId()==R.id.bt_leadSource_lead)
        {
            intent.putStringArrayListExtra("list", (ArrayList<String>) list);
            intent.putExtra("Button","leadSource");
        }
        else if(v.getId()==R.id.bt_industry_lead)
        {
            intent.putStringArrayListExtra("list", (ArrayList<String>) list);
            intent.putExtra("Button","industry");
        }
        startActivityForResult(intent,2);
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


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if(resultCode == RESULT_OK) {
                int indexValue = data.getIntExtra("index",-1);
                buttonName=data.getStringExtra("Button");
                //Toast.makeText(AddLeadActivity.this, "item clicked "+indexValue, Toast.LENGTH_SHORT).show();
                Log.e("index",""+indexValue);
                Log.e("Button",buttonName);
                setData(indexValue);
            }
        }

    }

    private void setData(int indexValue) {
        if(buttonName.equals("leadSource")){
            leadsource.setText(list.get(indexValue));
        }
        else if(buttonName.equals("industry")){
            industry.setText(list.get(indexValue));
        }
    }
}
