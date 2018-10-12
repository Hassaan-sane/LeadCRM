package com.example.hassaan.leadcrm.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.hassaan.leadcrm.R;

public class AddAccountActivity extends AppCompatActivity {

    EditText et_accountOwner_account,et_accountName_account,et_phone_account,et_accountSite_account;
    EditText et_accountNumber_account,et_website_account,et_tickerSymbol_account,et_employees_account;
    EditText et_annualRevenue_account,et_sicCode_account,et_streetBilling_account,et_cityBilling_account,et_stateBilling_account;
    EditText et_codeBilling_account,et_countryBilling_account,et_streetShipping_account,et_cityShipping_account,et_stateShipping_account;
    EditText et_codeShipping_account,et_countryShipping_account;

    Button bt_rating_account,bt_parentAccount_account,bt_accountType_account,bt_ownership_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);

    }
}
