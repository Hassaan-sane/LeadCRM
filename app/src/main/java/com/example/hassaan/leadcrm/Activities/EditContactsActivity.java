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

public class EditContactsActivity extends AppCompatActivity implements View.OnClickListener,DatePickerDialog.OnDateSetListener{


    private List<String> list=new ArrayList<String>();
    EditText et_contactOwner_contacts,et_firstName_contacts,et_lastName_contacts,et_email_contacts;
    EditText et_title_contacts,et_department_contacts,et_phone_contacts,et_homePhone_contacts,et_otherPhone_contacts,et_fax_contacts;
    EditText et_mobile_contacts,et_assistant_contacts,et_asstPhone_contacts,et_reportsTo_contacts,et_skypeId_contacts;
    EditText et_secondaryEmail_contacts,et_twitter_contacts;

    Button bt_leadSource_contacts,bt_accountName_contacts,bt_dob_contacts,bt_salutation_contacts;
    Switch switch_emailOptOut_contacts;
    EditText  et_streetBilling_contacts, et_cityBilling_contacts, et_stateBilling_contacts;
    EditText et_codeBilling_contacts, et_countryBilling_contacts, et_streetShipping_contacts, et_cityShipping_contacts, et_stateShipping_contacts;
    EditText et_codeShipping_contacts, et_countryShipping_contacts,et_description_contacts;
    ImageView iv_photo_contacts;

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
        et_assistant_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_contactOwner_contacts=findViewById(R.id.et_contactOwner_contactEdit);
        et_firstName_contacts=findViewById(R.id.et_firstName_contactsEdit);
        et_lastName_contacts=findViewById(R.id.et_lastName_contactsEdit);
        et_email_contacts=findViewById(R.id.et_email_contactsEdit);
        et_title_contacts=findViewById(R.id.et_title_contactsEdit);
        et_department_contacts=findViewById(R.id.et_department_contactsEdit);
        et_phone_contacts=findViewById(R.id.et_phone_contactsEdit);
        et_homePhone_contacts=findViewById(R.id.et_homePhone_contactsEdit);
        et_otherPhone_contacts=findViewById(R.id.et_otherPhone_contactsEdit);
        et_fax_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_mobile_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_asstPhone_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_reportsTo_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_skypeId_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_secondaryEmail_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_twitter_contacts=findViewById(R.id.et_assistant_contactsEdit);
        et_codeBilling_contacts = findViewById(R.id.et_codeBilling_contactsEdit );
        et_codeShipping_contacts = findViewById(R.id.et_codeShipping_contactsEdit );
        et_countryBilling_contacts = findViewById(R.id.et_countryBilling_contactsEdit );
        et_countryShipping_contacts = findViewById(R.id.et_countryShipping_contactsEdit );
        et_streetBilling_contacts = findViewById(R.id.et_streetBilling_contactsEdit );
        et_streetShipping_contacts = findViewById(R.id.et_streetShipping_contactsEdit );
        et_cityBilling_contacts = findViewById(R.id.et_cityBilling_contactsEdit );
        et_cityShipping_contacts = findViewById(R.id.et_cityShipping_contactsEdit );
        et_stateBilling_contacts = findViewById(R.id.et_stateBilling_contactsEdit );
        et_stateShipping_contacts = findViewById(R.id.et_stateShipping_contactsEdit );
        et_description_contacts = findViewById(R.id.et_description_contactsEdit );

        bt_leadSource_contacts=findViewById(R.id.bt_leadSource_contactsEdit);
        bt_accountName_contacts=findViewById(R.id.bt_accountName_contactsEdit);
        bt_dob_contacts=findViewById(R.id.bt_dob_contactsEdit);
        bt_salutation_contacts=findViewById(R.id.bt_salutation_contactsEdit);

        switch_emailOptOut_contacts=findViewById(R.id.switch_emailOpt_contactsEdit);
        iv_photo_contacts=findViewById(R.id.iv_image_contactsEdit);

        bt_dob_contacts.setOnClickListener(this);
        bt_accountName_contacts.setOnClickListener(this);
        bt_leadSource_contacts.setOnClickListener(this);
        bt_salutation_contacts.setOnClickListener(this);
        iv_photo_contacts=findViewById(R.id.iv_image_contacts);
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
            bt_leadSource_contacts.setText(list.get(indexValue));
        }
        else if(buttonName.equals("accountName")){
            bt_accountName_contacts.setText(list.get(indexValue));
        }
        else if(buttonName.equals("salutation")){
            bt_salutation_contacts.setText(list.get(indexValue));
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


        bt_dob_contacts.setText(pickedDate);

    }
}
