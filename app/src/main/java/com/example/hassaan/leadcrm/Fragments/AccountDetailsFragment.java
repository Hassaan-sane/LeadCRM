package com.example.hassaan.leadcrm.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.AccountsRepo;
import com.example.hassaan.leadcrm.TableClasses.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountDetailsFragment extends Fragment {

    TextView tv_accountOwner_accountDetails, tv_accountName_accountDetails, tv_phone_accountDetails, tv_accountSite_accountDetails;
    TextView tv_accountNumber_accountDetails, tv_website_accountDetails, tv_tickerSymbol_accountDetails, tv_employees_accountDetails;
    TextView tv_annualRevenue_accountDetails, tv_sicCode_accountDetails, tv_streetBilling_accountDetails, tv_cityBilling_accountDetails, tv_stateBilling_accountDetails;
    TextView tv_codeBilling_accountDetails, tv_countryBilling_accountDetails, tv_streetShipping_accountDetails, tv_cityShipping_accountDetails, tv_stateShipping_accountDetails;
    TextView tv_codeShipping_accountDetails, tv_countryShipping_accountDetails, tv_description_accountDetails;
    TextView tv_rating_accountDetails, tv_parentAccount_accountDetails, tv_accountType_accountDetails, tv_ownership_accountDetails, tv_industry_accountDetails;

    private List<Account> accountList = new ArrayList<>();
    public AccountDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_account_details, container, false);
        createReferences(view);

        AccountsRepo accountsRepo = new AccountsRepo();

        accountList = accountsRepo.getAccountShortList();

        tv_accountName_accountDetails.setText(accountList.get(0).getAccountName());

        return view;
    }

    private void createReferences(View view) {
        tv_accountOwner_accountDetails = view.findViewById(R.id.tv_accountOwner_accountDetails);
        tv_accountNumber_accountDetails = view.findViewById(R.id.tv_accountNumber_accountDetails);
        tv_annualRevenue_accountDetails = view.findViewById(R.id.tv_annualRevenue_accountDetails);
        tv_codeBilling_accountDetails = view.findViewById(R.id.tv_codeBilling_accountDetails);
        tv_codeShipping_accountDetails = view.findViewById(R.id.tv_codeShipping_accountDetails);
        tv_accountName_accountDetails = view.findViewById(R.id.tv_accountName_accountDetails);
        tv_website_accountDetails = view.findViewById(R.id.tv_website_accountDetails);
        tv_sicCode_accountDetails = view.findViewById(R.id.tv_sicCode_accountDetails);
        tv_countryBilling_accountDetails = view.findViewById(R.id.tv_countryBilling_accountDetails);
        tv_countryShipping_accountDetails = view.findViewById(R.id.tv_countryShipping_accountDetails);
        tv_phone_accountDetails = view.findViewById(R.id.tv_phone_accountDetails);
        tv_accountSite_accountDetails = view.findViewById(R.id.tv_accountSite_accountDetails);
        tv_tickerSymbol_accountDetails = view.findViewById(R.id.tv_tickerSymbol_accountDetails);
        tv_streetBilling_accountDetails = view.findViewById(R.id.tv_streetBilling_accountDetails);
        tv_streetShipping_accountDetails = view.findViewById(R.id.tv_streetShipping_accountDetails);
        tv_employees_accountDetails = view.findViewById(R.id.tv_employees_accountDetails);
        tv_cityBilling_accountDetails = view.findViewById(R.id.tv_cityBilling_accountDetails);
        tv_cityShipping_accountDetails = view.findViewById(R.id.tv_cityShipping_accountDetails);
        tv_stateBilling_accountDetails = view.findViewById(R.id.tv_stateBilling_accountDetails);
        tv_stateShipping_accountDetails= view.findViewById(R.id.tv_stateShipping_accountDetails);
        tv_description_accountDetails = view.findViewById(R.id.tv_description_accountDetails);

        tv_accountType_accountDetails = view.findViewById(R.id.tv_accountType_accountDetails);
        tv_rating_accountDetails = view.findViewById(R.id.tv_rating_accountDetails);
        tv_parentAccount_accountDetails = view.findViewById(R.id.tv_parentAccount_accountDetails);
        tv_ownership_accountDetails = view.findViewById(R.id.tv_ownership_accountDetails);
        tv_industry_accountDetails = view.findViewById(R.id.tv_industry_accountDetails);
    }

}
