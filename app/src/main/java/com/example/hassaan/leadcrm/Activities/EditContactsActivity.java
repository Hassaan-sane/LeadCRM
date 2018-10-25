package com.example.hassaan.leadcrm.Activities;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.hassaan.leadcrm.Fragments.DatePickerFragment;
import com.example.hassaan.leadcrm.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EditContactsActivity extends AppCompatActivity implements View.OnClickListener,DatePickerDialog.OnDateSetListener
{


    private List<String> list=new ArrayList<String>();
    EditText et_contactOwner_contacts_edit,et_firstName_contacts_edit,et_lastName_contacts_edit,et_email_contacts_edit;
    EditText et_title_contacts_edit,et_department_contacts_edit,et_phone_contacts_edit,et_homePhone_contacts_edit,et_otherPhone_contacts_edit,et_fax_contacts_edit;
    EditText et_mobile_contacts_edit,et_assistant_contacts_edit,et_asstPhone_contacts_edit,et_reportsTo_contacts_edit,et_skypeId_contacts_edit;
    EditText et_secondaryEmail_contacts_edit,et_twitter_contacts_edit;

    Button bt_leadSource_contacts_edit,bt_accountName_contacts_edit,bt_dob_contacts_edit,bt_salutation_contacts_edit;
    Switch switch_emailOptOut_contacts_edit;
    EditText  et_streetBilling_contacts_edit, et_cityBilling_contacts_edit, et_stateBilling_contacts_edit;
    EditText et_codeBilling_contacts_edit, et_countryBilling_contacts_edit, et_streetShipping_contacts_edit, et_cityShipping_contacts_edit, et_stateShipping_contacts_edit;
    EditText et_codeShipping_contacts_edit, et_countryShipping_contacts_edit,et_description_contacts_edit;
    ImageView iv_photo_contacts_edit;

    private String buttonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contacts);
        createReferences();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,StickyListView.class);;
        switch (v.getId())
        {
            case R.id.bt_leadSource_contacts:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","leadSource");
                startActivityForResult(intent,2);
                break;
            case R.id.bt_accountName_contacts:
                Log.e("accountname","sfskufgskfskuf.s.ku");
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","accountName");
                startActivityForResult(intent,2);
                break;
            case R.id.bt_dob_contacts:
                android.support.v4.app.DialogFragment startDatePicker;
                startDatePicker = new DatePickerFragment();
                startDatePicker.show(getSupportFragmentManager(), "Start Date of Event");
                break;
            case R.id.bt_salutation_contacts:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","salutation");
                startActivityForResult(intent,2);
                break;
            case R.id.iv_image_contacts:

                break;
        }

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


    private void createReferences(){

        et_assistant_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_contactOwner_contacts_edit=findViewById(R.id.et_contactOwner_contact_edit);
        et_firstName_contacts_edit=findViewById(R.id.et_firstName_contacts_edit);
        et_lastName_contacts_edit=findViewById(R.id.et_lastName_contacts_edit);
        et_email_contacts_edit=findViewById(R.id.et_email_contacts_edit);
        et_title_contacts_edit=findViewById(R.id.et_title_contacts_edit);
        et_department_contacts_edit=findViewById(R.id.et_department_contacts_edit);
        et_phone_contacts_edit=findViewById(R.id.et_phone_contacts_edit);
        et_homePhone_contacts_edit=findViewById(R.id.et_homePhone_contacts_edit);
        et_otherPhone_contacts_edit=findViewById(R.id.et_otherPhone_contacts_edit);
        et_fax_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_mobile_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_asstPhone_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_reportsTo_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_skypeId_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_secondaryEmail_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_twitter_contacts_edit=findViewById(R.id.et_assistant_contacts_edit);
        et_codeBilling_contacts_edit = findViewById(R.id.et_codeBilling_contacts_edit );
        et_codeShipping_contacts_edit = findViewById(R.id.et_codeShipping_contacts_edit);
        et_countryBilling_contacts_edit = findViewById(R.id.et_countryBilling_contacts_edit );
        et_countryShipping_contacts_edit = findViewById(R.id.et_countryShipping_contacts_edit );
        et_streetBilling_contacts_edit = findViewById(R.id.et_streetBilling_contacts_edit );
        et_streetShipping_contacts_edit = findViewById(R.id.et_streetShipping_contacts_edit );
        et_cityBilling_contacts_edit = findViewById(R.id.et_cityBilling_contacts_edit );
        et_cityShipping_contacts_edit = findViewById(R.id.et_cityShipping_contacts_edit );
        et_stateBilling_contacts_edit = findViewById(R.id.et_stateBilling_contacts_edit );
        et_stateShipping_contacts_edit = findViewById(R.id.et_stateShipping_contacts_edit );
        et_description_contacts_edit = findViewById(R.id.et_description_contacts_edit );

        bt_leadSource_contacts_edit=findViewById(R.id.bt_leadSource_contacts_edit);
        bt_accountName_contacts_edit=findViewById(R.id.bt_accountName_contacts_edit);
        bt_dob_contacts_edit=findViewById(R.id.bt_dob_contacts_edit);
        bt_salutation_contacts_edit=findViewById(R.id.bt_salutation_contacts_edit);

        switch_emailOptOut_contacts_edit=findViewById(R.id.switch_emailOpt_contacts_edit);
        iv_photo_contacts_edit=findViewById(R.id.iv_image_contacts_edit);



        bt_dob_contacts_edit.setOnClickListener(this);
        bt_accountName_contacts_edit.setOnClickListener(this);
        bt_leadSource_contacts_edit.setOnClickListener(this);
        bt_salutation_contacts_edit.setOnClickListener(this);
        iv_photo_contacts_edit=findViewById(R.id.iv_image_contacts);
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
            bt_leadSource_contacts_edit.setText(list.get(indexValue));
        }
        else if(buttonName.equals("accountName")){
            bt_accountName_contacts_edit.setText(list.get(indexValue));
        }
        else if(buttonName.equals("salutation")){
            bt_salutation_contacts_edit.setText(list.get(indexValue));
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


        bt_dob_contacts_edit.setText(pickedDate);

    }
}
