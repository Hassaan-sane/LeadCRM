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

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.TableClasses.Leads;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EditLeadActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_leadsource_lead_edit, bt_industry_lead_edit, bt_lead_edit_hide;
    EditText et_leadOwner_lead_edit, et_company_lead_edit, et_title_lead_edit, et_mobile_lead_edit, et_phone_lead_edit, et_annualRevenue_lead_edit, et_email_lead_edit;
    EditText et_website_lead_edit, et_noOfEmployee_lead_edit, et_skypeId_lead_edit, et_leadname_lead_edit;

    TextView tv_leadOwner_lead_edit, tv_company_lead_edit, tv_title_lead_edit, tv_mobile_lead_edit, tv_phone_lead_edit, tv_annualRevenue_lead_edit,tv_email_lead_edit;
    TextView tv_website_lead_edit, tv_noOfEmployee_lead_edit, tv_skypeId_lead_edit, tv_leadname_lead_edit,tv_leadsource_lead_edit,tv_industry_lead_edit;


    private List<String> list = new ArrayList<String>();
    private List<Leads> Leadlist = new ArrayList<>();

    private String buttonName;
    private int LeadPosition;

    private Boolean show_hide=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_lead);

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        java.util.Collections.sort(list);
        createReferences();

        if (getIntent() != null) {
            LeadPosition = getIntent().getIntExtra("LeadPosition",0);

            LeadsRepo leadsRepo = new LeadsRepo();
            Leadlist=leadsRepo.getLeadsList();

            et_leadOwner_lead_edit.setText(Leadlist.get(LeadPosition).getLeadOwner());
            et_company_lead_edit.setText(Leadlist.get(LeadPosition).getCompanyName());
            et_leadname_lead_edit.setText(Leadlist.get(LeadPosition).getLeadName());
            et_title_lead_edit.setText(Leadlist.get(LeadPosition).getTitle());
        }

        bt_lead_edit_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(show_hide==true){
                    show_hide=false;
                    toggleFields(show_hide);
                    bt_lead_edit_hide.setText("Show Extra");

                }
                else{
                    show_hide=true;
                    toggleFields(show_hide);
                    bt_lead_edit_hide.setText("Hide Extra");
                }

            }
        });

    }

    private void toggleFields(Boolean bool){
        if(bool==true){

            et_company_lead_edit.setVisibility(View.VISIBLE);       tv_company_lead_edit.setVisibility(View.VISIBLE);
            et_leadname_lead_edit.setVisibility(View.VISIBLE);      tv_leadname_lead_edit.setVisibility(View.VISIBLE);
            et_leadOwner_lead_edit.setVisibility(View.VISIBLE);     tv_leadOwner_lead_edit.setVisibility(View.VISIBLE);
            et_title_lead_edit.setVisibility(View.VISIBLE);         tv_title_lead_edit.setVisibility(View.VISIBLE);

            et_email_lead_edit.setVisibility(View.VISIBLE);         tv_email_lead_edit.setVisibility(View.VISIBLE);
            et_mobile_lead_edit.setVisibility(View.VISIBLE);        tv_mobile_lead_edit.setVisibility(View.VISIBLE);
            et_phone_lead_edit.setVisibility(View.VISIBLE);         tv_phone_lead_edit.setVisibility(View.VISIBLE);
            et_annualRevenue_lead_edit.setVisibility(View.VISIBLE); tv_annualRevenue_lead_edit.setVisibility(View.VISIBLE);
            et_website_lead_edit.setVisibility(View.VISIBLE);       tv_website_lead_edit.setVisibility(View.VISIBLE);
            et_noOfEmployee_lead_edit.setVisibility(View.VISIBLE);  tv_noOfEmployee_lead_edit.setVisibility(View.VISIBLE);
            et_skypeId_lead_edit.setVisibility(View.VISIBLE);       tv_skypeId_lead_edit.setVisibility(View.VISIBLE);

            bt_industry_lead_edit.setVisibility(View.VISIBLE);         tv_industry_lead_edit.setVisibility(View.VISIBLE);
            bt_leadsource_lead_edit.setVisibility(View.VISIBLE);       tv_leadsource_lead_edit.setVisibility(View.VISIBLE);

        }
        else{
            et_company_lead_edit.setVisibility(View.VISIBLE);       tv_company_lead_edit.setVisibility(View.VISIBLE);
            et_leadname_lead_edit.setVisibility(View.VISIBLE);      tv_leadname_lead_edit.setVisibility(View.VISIBLE);
            et_leadOwner_lead_edit.setVisibility(View.VISIBLE);     tv_leadOwner_lead_edit.setVisibility(View.VISIBLE);
            et_title_lead_edit.setVisibility(View.VISIBLE);         tv_title_lead_edit.setVisibility(View.VISIBLE);

            et_email_lead_edit.setVisibility(View.GONE);            tv_email_lead_edit.setVisibility(View.GONE);
            et_mobile_lead_edit.setVisibility(View.GONE);           tv_mobile_lead_edit.setVisibility(View.GONE);
            et_phone_lead_edit.setVisibility(View.GONE);            tv_phone_lead_edit.setVisibility(View.GONE);
            et_annualRevenue_lead_edit.setVisibility(View.GONE);    tv_annualRevenue_lead_edit.setVisibility(View.GONE);
            et_website_lead_edit.setVisibility(View.GONE);          tv_website_lead_edit.setVisibility(View.GONE);
            et_noOfEmployee_lead_edit.setVisibility(View.GONE);     tv_noOfEmployee_lead_edit.setVisibility(View.GONE);
            et_skypeId_lead_edit.setVisibility(View.GONE);          tv_skypeId_lead_edit.setVisibility(View.GONE);

            bt_industry_lead_edit.setVisibility(View.GONE);         tv_industry_lead_edit.setVisibility(View.GONE);
            bt_leadsource_lead_edit.setVisibility(View.GONE);       tv_leadsource_lead_edit.setVisibility(View.GONE);

        }

    }

    private void createReferences() {
        et_leadOwner_lead_edit = findViewById(R.id.et_leadOwner_lead_edit);             tv_leadOwner_lead_edit = findViewById(R.id.tv_leadOwner_lead_edit);
        et_company_lead_edit = findViewById(R.id.et_company_lead_edit);                 tv_company_lead_edit = findViewById(R.id.tv_company_lead_edit);
        et_title_lead_edit = findViewById(R.id.et_title_lead_edit);                     tv_title_lead_edit = findViewById(R.id.tv_title_lead_edit);
        et_leadname_lead_edit=findViewById(R.id.et_leadname_lead_edit);                 tv_leadname_lead_edit=findViewById(R.id.tv_leadname_lead_edit);
        et_mobile_lead_edit = findViewById(R.id.et_mobile_lead_edit);                   tv_mobile_lead_edit = findViewById(R.id.tv_mobile_lead_edit);
        et_phone_lead_edit = findViewById(R.id.et_phone_lead_edit);                     tv_phone_lead_edit = findViewById(R.id.tv_phone_lead_edit);
        et_annualRevenue_lead_edit = findViewById(R.id.et_annualRevenue_lead_edit);     tv_annualRevenue_lead_edit = findViewById(R.id.tv_annualRevenue_lead_edit);
        et_email_lead_edit = findViewById(R.id.et_email_lead_edit);                     tv_email_lead_edit = findViewById(R.id.tv_email_lead_edit);
        et_website_lead_edit = findViewById(R.id.et_website_lead_edit);                 tv_website_lead_edit = findViewById(R.id.tv_website_lead_edit);
        et_noOfEmployee_lead_edit = findViewById(R.id.et_noOfEmployee_lead_edit);       tv_noOfEmployee_lead_edit = findViewById(R.id.tv_noOfEmployee_lead_edit);
        et_skypeId_lead_edit = findViewById(R.id.et_skypeId_lead_edit);                 tv_skypeId_lead_edit = findViewById(R.id.tv_skypeId_lead_edit);

        bt_leadsource_lead_edit = findViewById(R.id.bt_leadSource_lead_edit);           tv_leadsource_lead_edit = findViewById(R.id.tv_leadSource_lead_edit);
        bt_industry_lead_edit = findViewById(R.id.bt_industry_lead_edit);               tv_industry_lead_edit = findViewById(R.id.tv_industry_lead_edit);

        bt_lead_edit_hide=findViewById(R.id.bt_lead_edit_hide);

        bt_leadsource_lead_edit.setOnClickListener(this);
        bt_industry_lead_edit.setOnClickListener(this);
    }

    private void validate(){

        if(et_leadOwner_lead_edit.length()==0){
            et_leadOwner_lead_edit.setError("This Field is Required");
        }
        if(et_company_lead_edit.length()==0){
            et_company_lead_edit.setError("This Field is Required");
        }
        if(et_title_lead_edit.length()==0){
            et_title_lead_edit.setError("This Field is Required");
        }
        if(et_leadname_lead_edit.length()==0){
            et_leadname_lead_edit.setError("This Field is Required");
        }

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, StickyListView.class);
        if (view.getId() == R.id.bt_leadSource_lead_edit) {
            intent.putStringArrayListExtra("list", (ArrayList<String>) list);
            intent.putExtra("Button", "leadSource");
        } else if (view.getId() == R.id.bt_industry_lead_edit) {
            intent.putStringArrayListExtra("list", (ArrayList<String>) list);
            intent.putExtra("Button", "industry");
        }
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                int indexValue = data.getIntExtra("index", -1);
                buttonName = data.getStringExtra("Button");
                //Toast.makeText(AddLeadActivity.this, "item clicked "+indexValue, Toast.LENGTH_SHORT).show();
                Log.e("index", "" + indexValue);
                Log.e("Button", buttonName);
                setData(indexValue);
            }
        }
    }

    private void setData(int indexValue) {
        if (buttonName.equals("leadSource")) {
            bt_leadsource_lead_edit.setText(list.get(indexValue));
        } else if (buttonName.equals("industry")) {
            bt_industry_lead_edit.setText(list.get(indexValue));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ok_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.ok) {
            Leads leads= new Leads();
//
//            leads.setID(Leadlist.get(LeadPosition).getID());
//            leads.setLeadName(et_leadname_lead_edit.getText().toString());
//            leads.setCompanyName(et_company_lead_edit.getText().toString());
//            leads.setTitle(et_title_lead_edit.getText().toString());
//            leads.setLeadOwner(et_leadOwner_lead_edit.getText().toString());
//
//            leads.setModifiedBy(Calendar.getInstance().getTime());
//
//            LeadsRepo leadsRepo = new LeadsRepo();
//
//            leadsRepo.updateLead(leads);
//
//            finish();
            validate();
        }


        return super.onOptionsItemSelected(item);
    }
}
