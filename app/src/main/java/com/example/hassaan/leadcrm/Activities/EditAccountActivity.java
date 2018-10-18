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
import android.widget.Toast;

import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class EditAccountActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_accountOwner_accountEdit, et_accountName_accountEdit, et_phone_accountEdit, et_accountSite_accountEdit;
    EditText et_accountNumber_accountEdit, et_website_accountEdit, et_tickerSymbol_accountEdit, et_employees_accountEdit;
    EditText et_annualRevenue_accountEdit, et_sicCode_accountEdit, et_streetBilling_accountEdit, et_cityBilling_accountEdit, et_stateBilling_accountEdit;
    EditText et_codeBilling_accountEdit, et_countryBilling_accountEdit, et_streetShipping_accountEdit, et_cityShipping_accountEdit, et_stateShipping_accountEdit;
    EditText et_codeShipping_accountEdit, et_countryShipping_accountEdit, et_description_accountEdit;

    Button bt_rating_accountEdit, bt_parentAccount_accountEdit, bt_accountType_accountEdit, bt_ownership_accountEdit, bt_industry_accountEdit;

    private List<String> list=new ArrayList<String>();

    private String buttonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account);

        createReferences();//bind all edit texts and buttons in this function
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
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

    private void createReferences() {
        et_accountOwner_accountEdit = findViewById(R.id.et_accountOwner_accountEdit);
        et_accountNumber_accountEdit = findViewById(R.id.et_accountNumber_accountEdit);
        et_annualRevenue_accountEdit = findViewById(R.id.et_annualRevenue_accountEdit);
        et_codeBilling_accountEdit = findViewById(R.id.et_codeBilling_accountEdit);
        et_codeShipping_accountEdit = findViewById(R.id.et_codeShipping_accountEdit);
        et_accountName_accountEdit=findViewById(R.id.et_accountName_accountEdit);
        et_website_accountEdit = findViewById(R.id.et_website_accountEdit);
        et_sicCode_accountEdit = findViewById(R.id.et_sicCode_accountEdit);
        et_countryBilling_accountEdit = findViewById(R.id.et_countryBilling_accountEdit);
        et_countryShipping_accountEdit = findViewById(R.id.et_countryShipping_accountEdit);
        et_phone_accountEdit = findViewById(R.id.et_phone_accountEdit);
        et_accountSite_accountEdit = findViewById(R.id.et_accountSite_accountEdit);
        et_tickerSymbol_accountEdit = findViewById(R.id.et_tickerSymbol_accountEdit);
        et_streetBilling_accountEdit = findViewById(R.id.et_streetBilling_accountEdit);
        et_streetShipping_accountEdit = findViewById(R.id.et_streetShipping_accountEdit);
        et_employees_accountEdit = findViewById(R.id.et_employees_accountEdit);
        et_cityBilling_accountEdit = findViewById(R.id.et_cityBilling_accountEdit);
        et_cityShipping_accountEdit = findViewById(R.id.et_cityShipping_accountEdit);
        et_stateBilling_accountEdit = findViewById(R.id.et_stateBilling_accountEdit);
        et_stateShipping_accountEdit = findViewById(R.id.et_stateShipping_accountEdit);
        et_description_accountEdit= findViewById(R.id.et_description_accountEdit);

        bt_accountType_accountEdit=findViewById(R.id.bt_accountType_accountEdit);
        bt_rating_accountEdit=findViewById(R.id.bt_rating_accountEdit);
        bt_parentAccount_accountEdit=findViewById(R.id.bt_parentAccount_accountEdit);
        bt_ownership_accountEdit=findViewById(R.id.bt_ownership_accountEdit);
        bt_industry_accountEdit=findViewById(R.id.bt_industry_accountsEdit);



        bt_industry_accountEdit.setOnClickListener(this);
        bt_accountType_accountEdit.setOnClickListener(this);
        bt_parentAccount_accountEdit.setOnClickListener(this);
        bt_ownership_accountEdit.setOnClickListener(this);
        bt_rating_accountEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,StickyListView.class);
        switch (v.getId())
        {
            case R.id.bt_accountType_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","accountType");
                break;
            case R.id.bt_rating_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","rating");
                break;
            case R.id.bt_parentAccount_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","parentAccount");
                break;
            case R.id.bt_ownership_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","ownership");
                break;
            case R.id.bt_industry_accountsEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","industry");
                break;
        }
        startActivityForResult(intent,2);
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
        if(buttonName.equals("accountType")){
            bt_accountType_accountEdit.setText(list.get(indexValue));
        }
        else if(buttonName.equals("ownership")){
            bt_ownership_accountEdit.setText(list.get(indexValue));
        }
        else if(buttonName.equals("rating")){
            bt_rating_accountEdit.setText(list.get(indexValue));
        }
        else if(buttonName.equals("parentAccount")){
            bt_parentAccount_accountEdit.setText(list.get(indexValue));
        }
        else if(buttonName.equals("industry")){
            bt_industry_accountEdit.setText(list.get(indexValue));
        }
    }
}
