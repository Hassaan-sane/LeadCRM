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

import com.example.hassaan.leadcrm.Fragments.LeadRelatedFragment;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.AccountsRepo;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.TableClasses.Account;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EditAccountActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_accountOwner_accountEdit, et_accountName_accountEdit, et_phone_accountEdit, et_accountSite_accountEdit;
    EditText et_accountNumber_accountEdit, et_website_accountEdit, et_tickerSymbol_accountEdit, et_employees_accountEdit;
    EditText et_annualRevenue_accountEdit, et_sicCode_accountEdit, et_streetBilling_accountEdit, et_cityBilling_accountEdit, et_stateBilling_accountEdit;
    EditText et_codeBilling_accountEdit, et_countryBilling_accountEdit, et_streetShipping_accountEdit, et_cityShipping_accountEdit, et_stateShipping_accountEdit;
    EditText et_codeShipping_accountEdit, et_countryShipping_accountEdit, et_description_accountEdit;

    Button bt_rating_accountEdit, bt_parentAccount_accountEdit, bt_accountType_accountEdit, bt_ownership_accountEdit, bt_industry_accountEdit,bt_account_hide_edit;

    TextView tv_accountOwner_accountEdit, tv_accountName_accountEdit, tv_phone_accountEdit, tv_accountSite_accountEdit,
            tv_accountNumber_accountEdit, tv_website_accountEdit, tv_tickerSymbol_accountEdit, tv_employees_accountEdit,
            tv_annualRevenue_accountEdit, tv_sicCode_accountEdit, tv_streetBilling_accountEdit, tv_cityBilling_accountEdit, tv_stateBilling_accountEdit,
            tv_codeBilling_accountEdit, tv_countryBilling_accountEdit, tv_streetShipping_accountEdit, tv_cityShipping_accountEdit, tv_stateShipping_accountEdit,
            tv_codeShipping_accountEdit, tv_countryShipping_accountEdit, tv_description_accountEdit,
            tv_rating_accountEdit, tv_parentAccount_accountEdit, tv_accountType_accountEdit, tv_ownership_accountEdit, tv_industry_accountEdit,
            tv_account_AIEdit,tv_account_DIEdit;

    private List<String> list = new ArrayList<String>();
    private List<Account> accountList = new ArrayList<>();

    private String buttonName;
    private boolean show_hide=true;
    private int AccountPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account);

        createReferences();//bind all edit texts and buttons in this function
//        list.add("Red");
//        list.add("Blue");
//        list.add("Green");
//        list.add("Yellow");
//        list.add("Black");
//        java.util.Collections.sort(list);
        if(getIntent()!=null){

            AccountPosition = getIntent().getIntExtra("AccountPosition",0);

            AccountsRepo accountsRepo = new AccountsRepo();
            accountList = accountsRepo.getAccountShortList();
            et_accountName_accountEdit.setText(accountList.get(AccountPosition).getAccountName());
        }


        bt_account_hide_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(show_hide==true){
                    show_hide=false;
                    toggleFields(show_hide);
                    bt_account_hide_edit.setText("Show Extra");
                }else{
                    show_hide=true;
                    toggleFields(show_hide);
                    bt_account_hide_edit.setText("Hide Extra");
                }
            }
        });

    }

    private void toggleFields(Boolean bool){


        if(bool==true){
            et_accountName_accountEdit.setVisibility(View.VISIBLE);     tv_accountName_accountEdit.setVisibility(View.VISIBLE);
            et_phone_accountEdit.setVisibility(View.VISIBLE);           tv_phone_accountEdit.setVisibility(View.VISIBLE);
            et_website_accountEdit.setVisibility(View.VISIBLE);         tv_website_accountEdit.setVisibility(View.VISIBLE);

            et_accountOwner_accountEdit.setVisibility(View.VISIBLE);    tv_accountOwner_accountEdit.setVisibility(View.VISIBLE);
            et_accountNumber_accountEdit.setVisibility(View.VISIBLE);   tv_accountNumber_accountEdit.setVisibility(View.VISIBLE);
            et_employees_accountEdit.setVisibility(View.VISIBLE);       tv_employees_accountEdit.setVisibility(View.VISIBLE);
            et_accountSite_accountEdit.setVisibility(View.VISIBLE);     tv_accountSite_accountEdit.setVisibility(View.VISIBLE);
            et_annualRevenue_accountEdit.setVisibility(View.VISIBLE);   tv_annualRevenue_accountEdit.setVisibility(View.VISIBLE);
            et_sicCode_accountEdit.setVisibility(View.VISIBLE);         tv_sicCode_accountEdit.setVisibility(View.VISIBLE);
            et_tickerSymbol_accountEdit.setVisibility(View.VISIBLE);    tv_tickerSymbol_accountEdit.setVisibility(View.VISIBLE);
            et_description_accountEdit.setVisibility(View.VISIBLE);     tv_description_accountEdit.setVisibility(View.VISIBLE);
            et_streetBilling_accountEdit.setVisibility(View.VISIBLE);   tv_streetBilling_accountEdit.setVisibility(View.VISIBLE);
            et_cityBilling_accountEdit.setVisibility(View.VISIBLE);     tv_cityBilling_accountEdit.setVisibility(View.VISIBLE);
            et_stateBilling_accountEdit.setVisibility(View.VISIBLE);    tv_stateBilling_accountEdit.setVisibility(View.VISIBLE);
            et_codeBilling_accountEdit.setVisibility(View.VISIBLE);     tv_codeBilling_accountEdit.setVisibility(View.VISIBLE);
            et_countryBilling_accountEdit.setVisibility(View.VISIBLE);  tv_countryBilling_accountEdit.setVisibility(View.VISIBLE);
            et_streetShipping_accountEdit.setVisibility(View.VISIBLE);  tv_streetShipping_accountEdit.setVisibility(View.VISIBLE);
            et_cityShipping_accountEdit.setVisibility(View.VISIBLE);    tv_cityShipping_accountEdit.setVisibility(View.VISIBLE);
            et_stateShipping_accountEdit.setVisibility(View.VISIBLE);   tv_stateShipping_accountEdit.setVisibility(View.VISIBLE);
            et_cityShipping_accountEdit.setVisibility(View.VISIBLE);    tv_cityShipping_accountEdit.setVisibility(View.VISIBLE);
            et_codeShipping_accountEdit.setVisibility(View.VISIBLE);    tv_codeShipping_accountEdit.setVisibility(View.VISIBLE);
            et_countryShipping_accountEdit.setVisibility(View.VISIBLE); tv_countryShipping_accountEdit.setVisibility(View.VISIBLE);

            bt_accountType_accountEdit.setVisibility(View.VISIBLE);     tv_accountType_accountEdit.setVisibility(View.VISIBLE);
            bt_industry_accountEdit.setVisibility(View.VISIBLE);        tv_industry_accountEdit.setVisibility(View.VISIBLE);
            bt_ownership_accountEdit.setVisibility(View.VISIBLE);       tv_ownership_accountEdit.setVisibility(View.VISIBLE);
            bt_parentAccount_accountEdit.setVisibility(View.VISIBLE);   tv_parentAccount_accountEdit.setVisibility(View.VISIBLE);
            bt_rating_accountEdit.setVisibility(View.VISIBLE);          tv_rating_accountEdit.setVisibility(View.VISIBLE);

            tv_account_AIEdit.setVisibility(View.VISIBLE);              tv_account_DIEdit.setVisibility(View.VISIBLE);
        }
        else{
            et_accountOwner_accountEdit.setVisibility(View.GONE);    tv_accountOwner_accountEdit.setVisibility(View.GONE);
            et_accountNumber_accountEdit.setVisibility(View.GONE);   tv_accountNumber_accountEdit.setVisibility(View.GONE);
            et_employees_accountEdit.setVisibility(View.GONE);       tv_employees_accountEdit.setVisibility(View.GONE);
            et_accountSite_accountEdit.setVisibility(View.GONE);     tv_accountSite_accountEdit.setVisibility(View.GONE);
            et_annualRevenue_accountEdit.setVisibility(View.GONE);   tv_annualRevenue_accountEdit.setVisibility(View.GONE);
            et_sicCode_accountEdit.setVisibility(View.GONE);         tv_sicCode_accountEdit.setVisibility(View.GONE);
            et_tickerSymbol_accountEdit.setVisibility(View.GONE);    tv_tickerSymbol_accountEdit.setVisibility(View.GONE);
            et_description_accountEdit.setVisibility(View.GONE);     tv_description_accountEdit.setVisibility(View.GONE);
            et_streetBilling_accountEdit.setVisibility(View.GONE);   tv_streetBilling_accountEdit.setVisibility(View.GONE);
            et_cityBilling_accountEdit.setVisibility(View.GONE);     tv_cityBilling_accountEdit.setVisibility(View.GONE);
            et_stateBilling_accountEdit.setVisibility(View.GONE);    tv_stateBilling_accountEdit.setVisibility(View.GONE);
            et_codeBilling_accountEdit.setVisibility(View.GONE);     tv_codeBilling_accountEdit.setVisibility(View.GONE);
            et_countryBilling_accountEdit.setVisibility(View.GONE);  tv_countryBilling_accountEdit.setVisibility(View.GONE);
            et_streetShipping_accountEdit.setVisibility(View.GONE);  tv_streetShipping_accountEdit.setVisibility(View.GONE);
            et_cityShipping_accountEdit.setVisibility(View.GONE);    tv_cityShipping_accountEdit.setVisibility(View.GONE);
            et_stateShipping_accountEdit.setVisibility(View.GONE);   tv_stateShipping_accountEdit.setVisibility(View.GONE);
            et_cityShipping_accountEdit.setVisibility(View.GONE);    tv_cityShipping_accountEdit.setVisibility(View.GONE);
            et_codeShipping_accountEdit.setVisibility(View.GONE);    tv_codeShipping_accountEdit.setVisibility(View.GONE);
            et_countryShipping_accountEdit.setVisibility(View.GONE); tv_countryShipping_accountEdit.setVisibility(View.GONE);

            bt_accountType_accountEdit.setVisibility(View.GONE);     tv_accountType_accountEdit.setVisibility(View.GONE);
            bt_industry_accountEdit.setVisibility(View.GONE);        tv_industry_accountEdit.setVisibility(View.GONE);
            bt_ownership_accountEdit.setVisibility(View.GONE);       tv_ownership_accountEdit.setVisibility(View.GONE);
            bt_parentAccount_accountEdit.setVisibility(View.GONE);   tv_parentAccount_accountEdit.setVisibility(View.GONE);
            bt_rating_accountEdit.setVisibility(View.GONE);          tv_rating_accountEdit.setVisibility(View.GONE);

            tv_account_AIEdit.setVisibility(View.GONE);              tv_account_DIEdit.setVisibility(View.GONE);
        }

    }

    private void createReferences() {
        et_accountOwner_accountEdit = findViewById(R.id.et_accountOwner_accountEdit);           tv_accountOwner_accountEdit = findViewById(R.id.tv_accountOwner_accountEdit);
        et_accountNumber_accountEdit = findViewById(R.id.et_accountNumber_accountEdit);         tv_accountNumber_accountEdit = findViewById(R.id.tv_accountNumber_accountEdit);
        et_annualRevenue_accountEdit = findViewById(R.id.et_annualRevenue_accountEdit);         tv_annualRevenue_accountEdit = findViewById(R.id.tv_annualRevenue_accountEdit);
        et_codeBilling_accountEdit = findViewById(R.id.et_codeBilling_accountEdit);             tv_codeBilling_accountEdit = findViewById(R.id.tv_codeBilling_accountEdit);
        et_codeShipping_accountEdit = findViewById(R.id.et_codeShipping_accountEdit);           tv_codeShipping_accountEdit = findViewById(R.id.tv_codeShipping_accountEdit);
        et_accountName_accountEdit = findViewById(R.id.et_accountName_accountEdit);             tv_accountName_accountEdit = findViewById(R.id.tv_accountName_accountEdit);
        et_website_accountEdit = findViewById(R.id.et_website_accountEdit);                     tv_website_accountEdit = findViewById(R.id.tv_website_accountEdit);
        et_sicCode_accountEdit = findViewById(R.id.et_sicCode_accountEdit);                     tv_sicCode_accountEdit = findViewById(R.id.tv_sicCode_accountEdit);
        et_countryBilling_accountEdit = findViewById(R.id.et_countryBilling_accountEdit);       tv_countryBilling_accountEdit = findViewById(R.id.tv_countryBilling_accountEdit);
        et_countryShipping_accountEdit = findViewById(R.id.et_countryShipping_accountEdit);     tv_countryShipping_accountEdit = findViewById(R.id.tv_countryShipping_accountEdit);
        et_phone_accountEdit = findViewById(R.id.et_phone_accountEdit);                         tv_phone_accountEdit = findViewById(R.id.tv_phone_accountEdit);
        et_accountSite_accountEdit = findViewById(R.id.et_accountSite_accountEdit);             tv_accountSite_accountEdit = findViewById(R.id.tv_accountSite_accountEdit);
        et_tickerSymbol_accountEdit = findViewById(R.id.et_tickerSymbol_accountEdit);           tv_tickerSymbol_accountEdit = findViewById(R.id.tv_tickerSymbol_accountEdit);
        et_streetBilling_accountEdit = findViewById(R.id.et_streetBilling_accountEdit);         tv_streetBilling_accountEdit = findViewById(R.id.tv_streetBilling_accountEdit);
        et_streetShipping_accountEdit = findViewById(R.id.et_streetShipping_accountEdit);       tv_streetShipping_accountEdit = findViewById(R.id.tv_streetShipping_accountEdit);
        et_employees_accountEdit = findViewById(R.id.et_employees_accountEdit);                 tv_employees_accountEdit = findViewById(R.id.tv_employees_accountEdit);
        et_cityBilling_accountEdit = findViewById(R.id.et_cityBilling_accountEdit);             tv_cityBilling_accountEdit = findViewById(R.id.tv_cityBilling_accountEdit);
        et_cityShipping_accountEdit = findViewById(R.id.et_cityShipping_accountEdit);           tv_cityShipping_accountEdit = findViewById(R.id.tv_cityShipping_accountEdit);
        et_stateBilling_accountEdit = findViewById(R.id.et_stateBilling_accountEdit);           tv_stateBilling_accountEdit = findViewById(R.id.tv_stateBilling_accountEdit);
        et_stateShipping_accountEdit = findViewById(R.id.et_stateShipping_accountEdit);         tv_stateShipping_accountEdit = findViewById(R.id.tv_stateShipping_accountEdit);
        et_description_accountEdit = findViewById(R.id.et_description_accountEdit);             tv_description_accountEdit = findViewById(R.id.tv_description_accountEdit);

        bt_accountType_accountEdit = findViewById(R.id.bt_accountType_accountEdit);             tv_accountType_accountEdit = findViewById(R.id.tv_accountType_accountEdit);
        bt_rating_accountEdit = findViewById(R.id.bt_rating_accountEdit);                       tv_rating_accountEdit = findViewById(R.id.tv_rating_accountEdit);
        bt_parentAccount_accountEdit = findViewById(R.id.bt_parentAccount_accountEdit);         tv_parentAccount_accountEdit = findViewById(R.id.tv_parentAccount_accountEdit);
        bt_ownership_accountEdit = findViewById(R.id.bt_ownership_accountEdit);                 tv_ownership_accountEdit = findViewById(R.id.tv_ownership_accountEdit);
        bt_industry_accountEdit = findViewById(R.id.bt_industry_accountsEdit);                  tv_industry_accountEdit = findViewById(R.id.tv_industry_accountsEdit);

        tv_account_AIEdit=findViewById(R.id.tv_account_AI_edit);
        tv_account_DIEdit=findViewById(R.id.tv_account_DI_edit);

        bt_account_hide_edit=findViewById(R.id.bt_account_hide_edit);

        bt_industry_accountEdit.setOnClickListener(this);
        bt_accountType_accountEdit.setOnClickListener(this);
        bt_parentAccount_accountEdit.setOnClickListener(this);
        bt_ownership_accountEdit.setOnClickListener(this);
        bt_rating_accountEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, StickyListView.class);
        switch (v.getId()) {
            case R.id.bt_accountType_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "accountType");
                break;
            case R.id.bt_rating_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "rating");
                break;
            case R.id.bt_parentAccount_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "parentAccount");
                break;
            case R.id.bt_ownership_accountEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "ownership");
                break;
            case R.id.bt_industry_accountsEdit:
                intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                intent.putExtra("Button", "industry");
                break;
        }
        startActivityForResult(intent, 2);
    }

    private boolean validate(){

        boolean bool= true;
        if(et_accountName_accountEdit.length()==0){
            et_accountName_accountEdit.setError("This Field is Required");
            bool=false;
        }
        if(et_phone_accountEdit.length()==0){
            et_phone_accountEdit.setError("This Field is Required");
            bool=false;
        }
        if(et_website_accountEdit.length()==0){
            et_website_accountEdit.setError("This Field is Required");
            bool=false;
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
            bt_accountType_accountEdit.setText(list.get(indexValue));
        } else if (buttonName.equals("ownership")) {
            bt_ownership_accountEdit.setText(list.get(indexValue));
        } else if (buttonName.equals("rating")) {
            bt_rating_accountEdit.setText(list.get(indexValue));
        } else if (buttonName.equals("parentAccount")) {
            bt_parentAccount_accountEdit.setText(list.get(indexValue));
        } else if (buttonName.equals("industry")) {
            bt_industry_accountEdit.setText(list.get(indexValue));
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
            else{
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            AccountsRepo accountsRepo = new AccountsRepo();
            Account account = new Account();

            account.setAccountName(et_accountName_accountEdit.getText().toString());
            account.setCreatedBy(Calendar.getInstance().getTime());
            account.setModifiedBy(Calendar.getInstance().getTime());
            account.setUserID(1);

            accountsRepo.updateAccountShort(account);
            finish();
            return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

}
