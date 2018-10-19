package com.example.hassaan.leadcrm.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactDetailsFragment extends Fragment {

    TextView tv_contactOwner_contactsDetails,tv_firstName_contactsDetails,tv_lastName_contactsDetails,tv_email_contactsDetails;
    TextView tv_title_contactsDetails,tv_department_contactsDetails,tv_phone_contactsDetails,tv_homePhone_contactsDetails,tv_otherPhone_contactsDetails,tv_fax_contactsDetails;
    TextView tv_mobile_contactsDetails,tv_assistant_contactsDetails,tv_asstPhone_contactsDetails,tv_reportsTo_contactsDetails,tv_skypeId_contactsDetails;
    TextView tv_secondaryEmail_contactsDetails,tv_twitter_contactsDetails;

    TextView tv_leadSource_contactsDetails,tv_accountName_contactsDetails,tv_dob_contactsDetails,tv_salutation_contactsDetails;
    TextView tv_emailOptOut_contactsDetails;
    TextView  tv_streetBilling_contactsDetails, tv_cityBilling_contactsDetails, tv_stateBilling_contactsDetails;
    TextView tv_codeBilling_contactsDetails, tv_countryBilling_contactsDetails, tv_streetShipping_contactsDetails, tv_cityShipping_contactsDetails, tv_stateShipping_contactsDetails;
    TextView tv_codeShipping_contactsDetails, tv_countryShipping_contactsDetails,tv_description_contactsDetails;

    public ContactDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_contact_details, container, false);
        createReferences(view);

        return view;
    }


    private void createReferences(View view) {
        tv_assistant_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_contactOwner_contactsDetails = view.findViewById(R.id.tv_contactOwner_contactDetails);
        tv_firstName_contactsDetails = view.findViewById(R.id.tv_firstName_contactDetails);
        tv_lastName_contactsDetails = view.findViewById(R.id.tv_lastName_contactDetails);
        tv_email_contactsDetails = view.findViewById(R.id.tv_email_contactDetails);
        tv_title_contactsDetails = view.findViewById(R.id.tv_title_contactDetails);
        tv_department_contactsDetails = view.findViewById(R.id.tv_department_contactDetails);
        tv_phone_contactsDetails = view.findViewById(R.id.tv_phone_contactDetails);
        tv_homePhone_contactsDetails = view.findViewById(R.id.tv_homePhone_contactDetails);
        tv_otherPhone_contactsDetails = view.findViewById(R.id.tv_otherPhone_contactDetails);
        tv_fax_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_mobile_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_asstPhone_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_reportsTo_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_skypeId_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_secondaryEmail_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_twitter_contactsDetails = view.findViewById(R.id.tv_assistant_contactDetails);
        tv_codeBilling_contactsDetails = view.findViewById(R.id.tv_codeBilling_contactDetails);
        tv_codeShipping_contactsDetails = view.findViewById(R.id.tv_codeShipping_contactDetails);
        tv_countryBilling_contactsDetails = view.findViewById(R.id.tv_countryBilling_contactDetails);
        tv_countryShipping_contactsDetails = view.findViewById(R.id.tv_countryShipping_contactDetails);
        tv_streetBilling_contactsDetails = view.findViewById(R.id.tv_streetBilling_contactDetails);
        tv_streetShipping_contactsDetails = view.findViewById(R.id.tv_streetShipping_contactDetails);
        tv_cityBilling_contactsDetails = view.findViewById(R.id.tv_cityBilling_contactDetails);
        tv_cityShipping_contactsDetails = view.findViewById(R.id.tv_cityShipping_contactDetails);
        tv_stateBilling_contactsDetails = view.findViewById(R.id.tv_stateBilling_contactDetails);
        tv_stateShipping_contactsDetails = view.findViewById(R.id.tv_stateShipping_contactDetails);
        tv_description_contactsDetails = view.findViewById(R.id.tv_description_contactDetails);
        tv_leadSource_contactsDetails = view.findViewById(R.id.tv_leadSource_contactDetails);
        tv_accountName_contactsDetails = view.findViewById(R.id.tv_accountName_contactDetails);
        tv_dob_contactsDetails = view.findViewById(R.id.tv_dob_contactDetails);
        tv_salutation_contactsDetails = view.findViewById(R.id.tv_salutation_contactDetails);
        tv_emailOptOut_contactsDetails = view.findViewById(R.id.tv_emailOpt_contactDetails);

    }
}
