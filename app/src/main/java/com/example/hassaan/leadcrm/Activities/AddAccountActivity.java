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

public class AddAccountActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_accountOwner_account, et_accountName_account, et_phone_account, et_accountSite_account;
    EditText et_accountNumber_account, et_website_account, et_tickerSymbol_account, et_employees_account;
    EditText et_annualRevenue_account, et_sicCode_account, et_streetBilling_account, et_cityBilling_account, et_stateBilling_account;
    EditText et_codeBilling_account, et_countryBilling_account, et_streetShipping_account, et_cityShipping_account, et_stateShipping_account;
    EditText et_codeShipping_account, et_countryShipping_account, et_description_account;

    Button bt_rating_account, bt_parentAccount_account, bt_accountType_account, bt_ownership_account, bt_industry_account;

    private List<String> list=new ArrayList<String>();

    private String buttonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);

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
        et_accountOwner_account = findViewById(R.id.et_accountOwner_account);
        et_accountNumber_account = findViewById(R.id.et_accountNumber_account);
        et_annualRevenue_account = findViewById(R.id.et_annualRevenue_account);
        et_codeBilling_account = findViewById(R.id.et_codeBilling_account);
        et_codeShipping_account = findViewById(R.id.et_codeShipping_account);
        et_accountName_account=findViewById(R.id.et_accountName_account);
        et_website_account = findViewById(R.id.et_website_account);
        et_sicCode_account = findViewById(R.id.et_sicCode_account);
        et_countryBilling_account = findViewById(R.id.et_countryBilling_account);
        et_countryShipping_account = findViewById(R.id.et_countryShipping_account);
        et_phone_account = findViewById(R.id.et_phone_account);
        et_accountSite_account = findViewById(R.id.et_accountSite_account);
        et_tickerSymbol_account = findViewById(R.id.et_tickerSymbol_account);
        et_streetBilling_account = findViewById(R.id.et_streetBilling_account);
        et_streetShipping_account = findViewById(R.id.et_streetShipping_account);
        et_employees_account = findViewById(R.id.et_employees_account);
        et_cityBilling_account = findViewById(R.id.et_cityBilling_account);
        et_cityShipping_account = findViewById(R.id.et_cityShipping_account);
        et_stateBilling_account = findViewById(R.id.et_stateBilling_account);
        et_stateShipping_account = findViewById(R.id.et_stateShipping_account);
        et_description_account= findViewById(R.id.et_description_account);

        bt_accountType_account=findViewById(R.id.bt_accountType_account);
        bt_rating_account=findViewById(R.id.bt_rating_account);
        bt_parentAccount_account=findViewById(R.id.bt_parentAccount_account);
        bt_ownership_account=findViewById(R.id.bt_ownership_account);
        bt_industry_account=findViewById(R.id.bt_industry_accounts);



        bt_industry_account.setOnClickListener(this);
        bt_accountType_account.setOnClickListener(this);
        bt_parentAccount_account.setOnClickListener(this);
        bt_ownership_account.setOnClickListener(this);
        bt_rating_account.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,StickyListView.class);
        switch (v.getId())
        {
            case R.id.bt_accountType_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","accountType");
                break;
            case R.id.bt_rating_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","rating");
                break;
            case R.id.bt_parentAccount_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","parentAccount");
                break;
            case R.id.bt_ownership_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button","ownership");
                break;
            case R.id.bt_industry_lead:
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
            bt_accountType_account.setText(list.get(indexValue));
        }
        else if(buttonName.equals("ownership")){
            bt_ownership_account.setText(list.get(indexValue));
        }
        else if(buttonName.equals("rating")){
            bt_rating_account.setText(list.get(indexValue));
        }
        else if(buttonName.equals("parentAccount")){
            bt_parentAccount_account.setText(list.get(indexValue));
        }
        else if(buttonName.equals("industry")){
            bt_industry_account.setText(list.get(indexValue));
        }
    }
}
