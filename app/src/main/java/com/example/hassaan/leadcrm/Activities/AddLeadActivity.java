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

import com.example.hassaan.leadcrm.Fragments.LeadsFragment;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.TableClasses.Leads;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AddLeadActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_leadsource_lead, bt_industry_lead,bt_lead_hide;

    EditText et_leadOwner_lead,et_company_lead,et_title_lead,et_mobile_lead,et_phone_lead,et_annualRevenue_lead,et_email_lead,et_leadname_lead;
    EditText et_website_lead,et_noOfEmployee_lead,et_skypeId_lead;

    private List<String> list=new ArrayList<String>();

    TextView tv_leadOwner_lead,tv_company_lead,tv_title_lead,tv_mobile_lead,tv_phone_lead,tv_annualRevenue_lead,tv_email_lead,tv_leadname_lead;
    TextView tv_website_lead,tv_noOfEmployee_lead,tv_skypeId_lead,tv_leadsource_lead,tv_industry_lead;

    private String buttonName;

    private Boolean show_hide=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lead);
        createReferences();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        java.util.Collections.sort(list);
        bt_lead_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if(show_hide==true){
                show_hide=false;
                toggleFields(show_hide);
                bt_lead_hide.setText("Show Extra");

            }
            else{
                show_hide=true;
                toggleFields(show_hide);
                bt_lead_hide.setText("Hide Extra");
            }

            }
        });
    }

    private void toggleFields(Boolean bool){
         if(bool==true){

             et_company_lead.setVisibility(View.VISIBLE);       tv_company_lead.setVisibility(View.VISIBLE);
             et_leadname_lead.setVisibility(View.VISIBLE);      tv_leadname_lead.setVisibility(View.VISIBLE);
             et_leadOwner_lead.setVisibility(View.VISIBLE);     tv_leadOwner_lead.setVisibility(View.VISIBLE);
             et_title_lead.setVisibility(View.VISIBLE);         tv_title_lead.setVisibility(View.VISIBLE);

             et_email_lead.setVisibility(View.VISIBLE);         tv_email_lead.setVisibility(View.VISIBLE);
             et_mobile_lead.setVisibility(View.VISIBLE);        tv_mobile_lead.setVisibility(View.VISIBLE);
             et_phone_lead.setVisibility(View.VISIBLE);         tv_phone_lead.setVisibility(View.VISIBLE);
             et_annualRevenue_lead.setVisibility(View.VISIBLE); tv_annualRevenue_lead.setVisibility(View.VISIBLE);
             et_website_lead.setVisibility(View.VISIBLE);       tv_website_lead.setVisibility(View.VISIBLE);
             et_noOfEmployee_lead.setVisibility(View.VISIBLE);  tv_noOfEmployee_lead.setVisibility(View.VISIBLE);
             et_skypeId_lead.setVisibility(View.VISIBLE);       tv_skypeId_lead.setVisibility(View.VISIBLE);

         }
         else{
             et_company_lead.setVisibility(View.VISIBLE);       tv_company_lead.setVisibility(View.VISIBLE);
             et_leadname_lead.setVisibility(View.VISIBLE);      tv_leadname_lead.setVisibility(View.VISIBLE);
             et_leadOwner_lead.setVisibility(View.VISIBLE);     tv_leadOwner_lead.setVisibility(View.VISIBLE);
             et_title_lead.setVisibility(View.VISIBLE);         tv_title_lead.setVisibility(View.VISIBLE);

             et_email_lead.setVisibility(View.GONE);            tv_email_lead.setVisibility(View.GONE);
             et_mobile_lead.setVisibility(View.GONE);           tv_mobile_lead.setVisibility(View.GONE);
             et_phone_lead.setVisibility(View.GONE);            tv_phone_lead.setVisibility(View.GONE);
             et_annualRevenue_lead.setVisibility(View.GONE);    tv_annualRevenue_lead.setVisibility(View.GONE);
             et_website_lead.setVisibility(View.GONE);          tv_website_lead.setVisibility(View.GONE);
             et_noOfEmployee_lead.setVisibility(View.GONE);     tv_noOfEmployee_lead.setVisibility(View.GONE);
             et_skypeId_lead.setVisibility(View.GONE);          tv_skypeId_lead.setVisibility(View.GONE);

             bt_industry_lead.setVisibility(View.GONE);         tv_industry_lead.setVisibility(View.GONE);
             bt_leadsource_lead.setVisibility(View.GONE);       tv_leadsource_lead.setVisibility(View.GONE);

         }

    }

    private void createReferences(){
        et_leadOwner_lead=findViewById(R.id.et_leadOwner_lead);         tv_leadOwner_lead=findViewById(R.id.tv_leadOwner_lead);
        et_company_lead=findViewById(R.id.et_company_lead);             tv_company_lead=findViewById(R.id.tv_company_lead);
        et_title_lead=findViewById(R.id.et_title_lead);                 tv_title_lead=findViewById(R.id.tv_title_lead);
        et_leadname_lead=findViewById(R.id.et_leadname_lead);           tv_leadname_lead=findViewById(R.id.tv_leadname_lead);
        et_mobile_lead=findViewById(R.id.et_mobile_lead);               tv_mobile_lead=findViewById(R.id.tv_mobile_lead);
        et_phone_lead=findViewById(R.id.et_phone_lead);                 tv_phone_lead=findViewById(R.id.tv_phone_lead);
        et_annualRevenue_lead=findViewById(R.id.et_annualRevenue_lead); tv_annualRevenue_lead=findViewById(R.id.tv_annualRevenue_lead);
        et_email_lead=findViewById(R.id.et_email_lead);                 tv_email_lead=findViewById(R.id.tv_email_lead);
        et_website_lead=findViewById(R.id.et_website_lead);             tv_website_lead=findViewById(R.id.tv_website_lead);
        et_noOfEmployee_lead=findViewById(R.id.et_noOfEmployee_lead);   tv_noOfEmployee_lead=findViewById(R.id.tv_noOfEmployee_lead);
        et_skypeId_lead=findViewById(R.id.et_skypeId_lead);             tv_skypeId_lead=findViewById(R.id.tv_skypeId_lead);

        bt_leadsource_lead=findViewById(R.id.bt_leadSource_lead);       tv_leadsource_lead=findViewById(R.id.tv_leadSource_lead);
        bt_industry_lead=findViewById(R.id.bt_industry_lead);           tv_industry_lead=findViewById(R.id.tv_industry_lead);
        bt_lead_hide=findViewById(R.id.bt_lead_hide);
        bt_leadsource_lead.setOnClickListener(this);
        bt_industry_lead.setOnClickListener(this);
//        bt_lead_hide.setOnClickListener(this);
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
            LeadsRepo leadsRepo= new LeadsRepo();
            Leads leads = new Leads();

            leads.setCompanyName(et_company_lead.getText().toString());
            leads.setTitle(et_title_lead.getText().toString());
            leads.setLeadOwner(et_leadOwner_lead.getText().toString());
            leads.setLeadName(et_leadname_lead.getText().toString());

            leads.setCreatedBy(Calendar.getInstance().getTime());
            leads.setModifiedBy(Calendar.getInstance().getTime());

             leadsRepo.inserShortinLeads(leads);



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
            bt_leadsource_lead.setText(list.get(indexValue));
        }
        else if(buttonName.equals("industry")){
            bt_industry_lead.setText(list.get(indexValue));
        }
    }
}
