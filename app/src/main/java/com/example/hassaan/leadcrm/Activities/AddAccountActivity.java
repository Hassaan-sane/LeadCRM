package com.example.hassaan.leadcrm.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hassaan.leadcrm.R;

public class AddAccountActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_accountOwner_account, et_accountName_account, et_phone_account, et_accountSite_account;
    EditText et_accountNumber_account, et_website_account, et_tickerSymbol_account, et_employees_account;
    EditText et_annualRevenue_account, et_sicCode_account, et_streetBilling_account, et_cityBilling_account, et_stateBilling_account;
    EditText et_codeBilling_account, et_countryBilling_account, et_streetShipping_account, et_cityShipping_account, et_stateShipping_account;
    EditText et_codeShipping_account, et_countryShipping_account;

    Button bt_rating_account, bt_parentAccount_account, bt_accountType_account, bt_ownership_account, bt_industry_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);

        createReferences();//bind all edit texts and buttons in this function


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

        bt_accountType_account=findViewById(R.id.bt_accountType_account);
        bt_rating_account=findViewById(R.id.bt_rating_account);
        bt_parentAccount_account=findViewById(R.id.bt_parentAccount_account);
        bt_ownership_account=findViewById(R.id.bt_ownership_account);
        bt_industry_account=findViewById(R.id.bt_industry_lead);



        bt_industry_account.setOnClickListener(this);
        bt_accountType_account.setOnClickListener(this);
        bt_parentAccount_account.setOnClickListener(this);
        bt_ownership_account.setOnClickListener(this);
        bt_rating_account.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bt_accountType_account:

                break;
            case R.id.bt_rating_account:

                break;
            case R.id.bt_parentAccount_account:

                break;
            case R.id.bt_ownership_account:

                break;
            case R.id.bt_industry_lead:

                break;
        }

    }
}
