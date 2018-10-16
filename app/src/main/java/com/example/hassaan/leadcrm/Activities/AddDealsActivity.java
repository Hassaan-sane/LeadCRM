package com.example.hassaan.leadcrm.Activities;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hassaan.leadcrm.Fragments.DatePickerFragment;
import com.example.hassaan.leadcrm.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AddDealsActivity extends AppCompatActivity implements View.OnClickListener,DatePickerDialog.OnDateSetListener {

    EditText et_prediction_deals,et_dealOwner_deals,et_amount_deals,et_dealName_deals,et_probability_deals,et_nextstep_deals,et_description_deals;
    TextView tv_expectedRevenue_deals;

    private List<String> list=new ArrayList<String>();
    private String buttonName;

    Button bt_closingDate_deals,bt_accountName_deals,bt_stage_deals,bt_type_deals,bt_leadSource_deals,bt_campaignSource_deals,bt_contactName_deals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_deals);
        createReferences();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("White");
        java.util.Collections.sort(list);

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
    public void onClick(View v) {
        Intent intent=new Intent(this,StickyListView.class);;
        switch (v.getId())
        {
            case R.id.bt_stage_deals:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","stage");
                startActivityForResult(intent,2);
                break;
            case R.id.bt_campaignSource_deals:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","campaignSource");
                startActivityForResult(intent,2);
                break;
            case R.id.bt_closingDate_deals:
                android.support.v4.app.DialogFragment startDatePicker;
                startDatePicker = new DatePickerFragment();
                startDatePicker.show(getSupportFragmentManager(), "Start Date of Event");
                break;
            case R.id.bt_type_deals:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","salutation");
                startActivityForResult(intent,2);
                break;
            case R.id.bt_accountName_deals:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","accountName");
                startActivityForResult(intent,2);
                break;
            case R.id.bt_leadSource_deals:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","leadSource");
                startActivityForResult(intent,2);
                break;
            case R.id.bt_contactName_deals:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","contactName");
                startActivityForResult(intent,2);
                break;
        }
    }
    private void createReferences(){
        et_amount_deals=findViewById(R.id.et_amount_deals);
        et_dealName_deals=findViewById(R.id.et_dealName_deals);
        et_dealOwner_deals=findViewById(R.id.et_dealOwner_deals);
        et_prediction_deals=findViewById(R.id.et_prediction_deals);
        et_probability_deals=findViewById(R.id.et_probability_deals);
        et_nextstep_deals=findViewById(R.id.et_nextstep_deals);
        et_description_deals=findViewById(R.id.et_description_deals);
        tv_expectedRevenue_deals=findViewById(R.id.tv_expectedRevenue_deals);


        bt_closingDate_deals=findViewById(R.id.bt_closingDate_deals);
        bt_accountName_deals=findViewById(R.id.bt_accountName_deals);
        bt_stage_deals=findViewById(R.id.bt_stage_deals);
        bt_type_deals=findViewById(R.id.bt_type_deals);
        bt_leadSource_deals=findViewById(R.id.bt_leadSource_deals);
        bt_campaignSource_deals=findViewById(R.id.bt_campaignSource_deals);
        bt_contactName_deals=findViewById(R.id.bt_contactName_deals);

        bt_stage_deals.setOnClickListener(this);
        bt_closingDate_deals.setOnClickListener(this);
        bt_accountName_deals.setOnClickListener(this);
        bt_leadSource_deals.setOnClickListener(this);
        bt_campaignSource_deals.setOnClickListener(this);
        bt_contactName_deals.setOnClickListener(this);
        bt_type_deals.setOnClickListener(this);
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
            bt_leadSource_deals.setText(list.get(indexValue));
        }
        else if(buttonName.equals("accountName")){
            bt_accountName_deals.setText(list.get(indexValue));
        }
        else if(buttonName.equals("type")){
            bt_type_deals.setText(list.get(indexValue));
        }
        else if(buttonName.equals("campaignSource")){
            bt_campaignSource_deals.setText(list.get(indexValue));
        }
        else if(buttonName.equals("contactName")){
            bt_contactName_deals.setText(list.get(indexValue));
        }
        else if(buttonName.equals("stage")){
            bt_stage_deals.setText(list.get(indexValue));
        }

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        String pickedDate;

        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        pickedDate = DateFormat.getDateInstance().format(c.getTime());//this will be displayed


        bt_closingDate_deals.setText(pickedDate);

    }
}
