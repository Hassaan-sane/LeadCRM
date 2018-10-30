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

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.AccountsRepo;
import com.example.hassaan.leadcrm.TableClasses.Account;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AddAccountActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_accountOwner_account, et_accountName_account, et_phone_account, et_accountSite_account;
    EditText et_accountNumber_account, et_website_account, et_tickerSymbol_account, et_employees_account;
    EditText et_annualRevenue_account, et_sicCode_account, et_streetBilling_account, et_cityBilling_account, et_stateBilling_account;
    EditText et_codeBilling_account, et_countryBilling_account, et_streetShipping_account, et_cityShipping_account, et_stateShipping_account;
    EditText et_codeShipping_account, et_countryShipping_account, et_description_account;

    Button bt_rating_account, bt_parentAccount_account, bt_accountType_account, bt_ownership_account, bt_industry_account,bt_account_hide;

    TextView tv_accountOwner_account, tv_accountName_account, tv_phone_account, tv_accountSite_account,
             tv_accountNumber_account, tv_website_account, tv_tickerSymbol_account, tv_employees_account,
             tv_annualRevenue_account, tv_sicCode_account, tv_streetBilling_account, tv_cityBilling_account, tv_stateBilling_account,
             tv_codeBilling_account, tv_countryBilling_account, tv_streetShipping_account, tv_cityShipping_account, tv_stateShipping_account,
             tv_codeShipping_account, tv_countryShipping_account, tv_description_account,
             tv_rating_account, tv_parentAccount_account, tv_accountType_account, tv_ownership_account, tv_industry_account,
             tv_account_AI,tv_account_DI;

    private List<String> list = new ArrayList<String>();

    private String buttonName;
    private boolean show_hide=true;

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

        bt_account_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(show_hide==true){
                    show_hide=false;
                    toggleFields(show_hide);
                    bt_account_hide.setText("Show Extra");

                }
                else{
                    show_hide=true;
                    toggleFields(show_hide);
                    bt_account_hide.setText("Hide Extra");
                }

            }
        });

    }


    private void toggleFields(Boolean bool){

        if(bool==true){
            et_accountName_account.setVisibility(View.VISIBLE);     tv_accountName_account.setVisibility(View.VISIBLE);
            et_phone_account.setVisibility(View.VISIBLE);           tv_phone_account.setVisibility(View.VISIBLE);
            et_website_account.setVisibility(View.VISIBLE);         tv_website_account.setVisibility(View.VISIBLE);

            et_accountOwner_account.setVisibility(View.VISIBLE);    tv_accountOwner_account.setVisibility(View.VISIBLE);
            et_accountNumber_account.setVisibility(View.VISIBLE);   tv_accountNumber_account.setVisibility(View.VISIBLE);
            et_employees_account.setVisibility(View.VISIBLE);       tv_employees_account.setVisibility(View.VISIBLE);
            et_accountSite_account.setVisibility(View.VISIBLE);     tv_accountSite_account.setVisibility(View.VISIBLE);
            et_annualRevenue_account.setVisibility(View.VISIBLE);   tv_annualRevenue_account.setVisibility(View.VISIBLE);
            et_sicCode_account.setVisibility(View.VISIBLE);         tv_sicCode_account.setVisibility(View.VISIBLE);
            et_tickerSymbol_account.setVisibility(View.VISIBLE);    tv_tickerSymbol_account.setVisibility(View.VISIBLE);
            et_description_account.setVisibility(View.VISIBLE);     tv_description_account.setVisibility(View.VISIBLE);
            et_streetBilling_account.setVisibility(View.VISIBLE);   tv_streetBilling_account.setVisibility(View.VISIBLE);
            et_cityBilling_account.setVisibility(View.VISIBLE);     tv_cityBilling_account.setVisibility(View.VISIBLE);
            et_stateBilling_account.setVisibility(View.VISIBLE);    tv_stateBilling_account.setVisibility(View.VISIBLE);
            et_codeBilling_account.setVisibility(View.VISIBLE);     tv_codeBilling_account.setVisibility(View.VISIBLE);
            et_countryBilling_account.setVisibility(View.VISIBLE);  tv_countryBilling_account.setVisibility(View.VISIBLE);
            et_streetShipping_account.setVisibility(View.VISIBLE);  tv_streetShipping_account.setVisibility(View.VISIBLE);
            et_cityShipping_account.setVisibility(View.VISIBLE);    tv_cityShipping_account.setVisibility(View.VISIBLE);
            et_stateShipping_account.setVisibility(View.VISIBLE);   tv_stateShipping_account.setVisibility(View.VISIBLE);
            et_cityShipping_account.setVisibility(View.VISIBLE);    tv_cityShipping_account.setVisibility(View.VISIBLE);
            et_codeShipping_account.setVisibility(View.VISIBLE);    tv_codeShipping_account.setVisibility(View.VISIBLE);
            et_countryShipping_account.setVisibility(View.VISIBLE); tv_countryShipping_account.setVisibility(View.VISIBLE);

            bt_accountType_account.setVisibility(View.VISIBLE);     tv_accountType_account.setVisibility(View.VISIBLE);
            bt_industry_account.setVisibility(View.VISIBLE);        tv_industry_account.setVisibility(View.VISIBLE);
            bt_ownership_account.setVisibility(View.VISIBLE);       tv_ownership_account.setVisibility(View.VISIBLE);
            bt_parentAccount_account.setVisibility(View.VISIBLE);   tv_parentAccount_account.setVisibility(View.VISIBLE);
            bt_rating_account.setVisibility(View.VISIBLE);          tv_rating_account.setVisibility(View.VISIBLE);

            tv_account_AI.setVisibility(View.VISIBLE);              tv_account_DI.setVisibility(View.VISIBLE);
        }
        else{
            et_accountOwner_account.setVisibility(View.GONE);    tv_accountOwner_account.setVisibility(View.GONE);
            et_accountNumber_account.setVisibility(View.GONE);   tv_accountNumber_account.setVisibility(View.GONE);
            et_employees_account.setVisibility(View.GONE);       tv_employees_account.setVisibility(View.GONE);
            et_accountSite_account.setVisibility(View.GONE);     tv_accountSite_account.setVisibility(View.GONE);
            et_annualRevenue_account.setVisibility(View.GONE);   tv_annualRevenue_account.setVisibility(View.GONE);
            et_sicCode_account.setVisibility(View.GONE);         tv_sicCode_account.setVisibility(View.GONE);
            et_tickerSymbol_account.setVisibility(View.GONE);    tv_tickerSymbol_account.setVisibility(View.GONE);
            et_description_account.setVisibility(View.GONE);     tv_description_account.setVisibility(View.GONE);
            et_streetBilling_account.setVisibility(View.GONE);   tv_streetBilling_account.setVisibility(View.GONE);
            et_cityBilling_account.setVisibility(View.GONE);     tv_cityBilling_account.setVisibility(View.GONE);
            et_stateBilling_account.setVisibility(View.GONE);    tv_stateBilling_account.setVisibility(View.GONE);
            et_codeBilling_account.setVisibility(View.GONE);     tv_codeBilling_account.setVisibility(View.GONE);
            et_countryBilling_account.setVisibility(View.GONE);  tv_countryBilling_account.setVisibility(View.GONE);
            et_streetShipping_account.setVisibility(View.GONE);  tv_streetShipping_account.setVisibility(View.GONE);
            et_cityShipping_account.setVisibility(View.GONE);    tv_cityShipping_account.setVisibility(View.GONE);
            et_stateShipping_account.setVisibility(View.GONE);   tv_stateShipping_account.setVisibility(View.GONE);
            et_cityShipping_account.setVisibility(View.GONE);    tv_cityShipping_account.setVisibility(View.GONE);
            et_codeShipping_account.setVisibility(View.GONE);    tv_codeShipping_account.setVisibility(View.GONE);
            et_countryShipping_account.setVisibility(View.GONE); tv_countryShipping_account.setVisibility(View.GONE);

            bt_accountType_account.setVisibility(View.GONE);     tv_accountType_account.setVisibility(View.GONE);
            bt_industry_account.setVisibility(View.GONE);        tv_industry_account.setVisibility(View.GONE);
            bt_ownership_account.setVisibility(View.GONE);       tv_ownership_account.setVisibility(View.GONE);
            bt_parentAccount_account.setVisibility(View.GONE);   tv_parentAccount_account.setVisibility(View.GONE);
            bt_rating_account.setVisibility(View.GONE);          tv_rating_account.setVisibility(View.GONE);

            tv_account_AI.setVisibility(View.GONE);              tv_account_DI.setVisibility(View.GONE);
        }
    }

    private void createReferences() {
        et_accountOwner_account = findViewById(R.id.et_accountOwner_account);               tv_accountOwner_account = findViewById(R.id.tv_accountOwner_account);
        et_accountNumber_account = findViewById(R.id.et_accountNumber_account);             tv_accountNumber_account = findViewById(R.id.tv_accountnumber_account);
        et_annualRevenue_account = findViewById(R.id.et_annualRevenue_account);             tv_annualRevenue_account = findViewById(R.id.tv_annualRevenue_account);
        et_codeBilling_account = findViewById(R.id.et_codeBilling_account);                 tv_codeBilling_account = findViewById(R.id.tv_codeBilling_account);
        et_codeShipping_account = findViewById(R.id.et_codeShipping_account);               tv_codeShipping_account = findViewById(R.id.tv_codeShipping_account);
        et_accountName_account = findViewById(R.id.et_accountName_account);                 tv_accountName_account = findViewById(R.id.tv_accountName_account);
        et_website_account = findViewById(R.id.et_website_account);                         tv_website_account = findViewById(R.id.tv_website_account);
        et_sicCode_account = findViewById(R.id.et_sicCode_account);                         tv_sicCode_account = findViewById(R.id.tv_sicCode_account);
        et_countryBilling_account = findViewById(R.id.et_countryBilling_account);           tv_countryBilling_account = findViewById(R.id.tv_countryBilling_account);
        et_countryShipping_account = findViewById(R.id.et_countryShipping_account);         tv_countryShipping_account = findViewById(R.id.tv_countryShipping_account);
        et_phone_account = findViewById(R.id.et_phone_account);                             tv_phone_account = findViewById(R.id.tv_phone_account);
        et_accountSite_account = findViewById(R.id.et_accountSite_account);                 tv_accountSite_account = findViewById(R.id.tv_accountSite_account);
        et_tickerSymbol_account = findViewById(R.id.et_tickerSymbol_account);               tv_tickerSymbol_account = findViewById(R.id.tv_tickerSymbol_account);
        et_streetBilling_account = findViewById(R.id.et_streetBilling_account);             tv_streetBilling_account = findViewById(R.id.tv_addressBilling_account);
        et_streetShipping_account = findViewById(R.id.et_streetShipping_account);           tv_streetShipping_account = findViewById(R.id.tv_addressShipping_account);
        et_employees_account = findViewById(R.id.et_employees_account);                     tv_employees_account = findViewById(R.id.tv_employees_account);
        et_cityBilling_account = findViewById(R.id.et_cityBilling_account);                 tv_cityBilling_account = findViewById(R.id.tv_cityBilling_account);
        et_cityShipping_account = findViewById(R.id.et_cityShipping_account);               tv_cityShipping_account = findViewById(R.id.tv_cityShipping_account);
        et_stateBilling_account = findViewById(R.id.et_stateBilling_account);               tv_stateBilling_account = findViewById(R.id.tv_stateBilling_account);
        et_stateShipping_account = findViewById(R.id.et_stateShipping_account);             tv_stateShipping_account = findViewById(R.id.tv_stateShipping_account);
        et_description_account = findViewById(R.id.et_description_account);                 tv_description_account = findViewById(R.id.tv_description_account);

        bt_accountType_account = findViewById(R.id.bt_accountType_account);                 tv_accountType_account = findViewById(R.id.tv_accountType_account);
        bt_rating_account = findViewById(R.id.bt_rating_account);                           tv_rating_account = findViewById(R.id.tv_rating_account);
        bt_parentAccount_account = findViewById(R.id.bt_parentAccount_account);             tv_parentAccount_account = findViewById(R.id.tv_parentAccount_account);
        bt_ownership_account = findViewById(R.id.bt_ownership_account);                     tv_ownership_account = findViewById(R.id.tv_ownership_account);
        bt_industry_account = findViewById(R.id.bt_industry_accounts);                      tv_industry_account = findViewById(R.id.tv_industry_accounts);

        tv_account_AI=findViewById(R.id.tv_account_AI);                                     tv_account_DI=findViewById(R.id.tv_account_DI);

        bt_account_hide=findViewById(R.id.bt_account_hide);
        bt_industry_account.setOnClickListener(this);
        bt_accountType_account.setOnClickListener(this);
        bt_parentAccount_account.setOnClickListener(this);
        bt_ownership_account.setOnClickListener(this);
        bt_rating_account.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, StickyListView.class);
        switch (v.getId()) {
            case R.id.bt_accountType_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "accountType");
                break;
            case R.id.bt_rating_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "rating");
                break;
            case R.id.bt_parentAccount_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "parentAccount");
                break;
            case R.id.bt_ownership_account:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "ownership");
                break;
            case R.id.bt_industry_accounts:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "industry");
                break;
        }
        startActivityForResult(intent, 2);
    }
    private boolean validate(){

        boolean bool= true;
        if(et_accountName_account.length()==0){
            et_accountName_account.setError("This Field is Required");
            bool=false;
        }
        if(et_phone_account.length()==0){
            et_phone_account.setError("This Field is Required");
            bool=false;
        }
        if(et_website_account.length()==0){
            et_website_account.setError("This Field is Required");
            bool = false;
        }
        return bool;

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
        if (buttonName.equals("accountType")) {
            bt_accountType_account.setText(list.get(indexValue));
        } else if (buttonName.equals("ownership")) {
            bt_ownership_account.setText(list.get(indexValue));
        } else if (buttonName.equals("rating")) {
            bt_rating_account.setText(list.get(indexValue));
        } else if (buttonName.equals("parentAccount")) {
            bt_parentAccount_account.setText(list.get(indexValue));
        } else if (buttonName.equals("industry")) {
            bt_industry_account.setText(list.get(indexValue));
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
            boolean bool = validate();
            if(bool==false){
                Toast.makeText(this, "Please Fill the fields First", Toast.LENGTH_SHORT).show();
            }
            else {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            AccountsRepo accountsRepo = new AccountsRepo();
            Account account = new Account();

            account.setAccountName(et_accountName_account.getText().toString());
            account.setCreatedBy(Calendar.getInstance().getTime());
            account.setModifiedBy(Calendar.getInstance().getTime());
                ///TODO:set UserID from shared pref
            account.setUserID(1);
            accountsRepo.insertShortInAccount(account);
            finish();
            return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }



}
