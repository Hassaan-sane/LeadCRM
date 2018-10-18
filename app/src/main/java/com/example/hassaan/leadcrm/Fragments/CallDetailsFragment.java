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
public class CallDetailsFragment extends Fragment {

    TextView tv_type_callsDetails, tv_contact_callsDetails, tv_call_purpose_callsDetails, tv_account_callsDetails, tv_callType_callsDetails, tv_reminder_callsDetails, cst_buttDetails;
    TextView tv_subject_callsDetails, tv_callDuration_callsDetails, tv_description_callsDetails, tv_calResult_callsDetails;
    TextView tv_billable_callsDetails;

    public CallDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_call_details, container, false);
        createReferences(view);
        return view;
    }

    private void createReferences(View view) {

        tv_account_callsDetails=view.findViewById(R.id.account_callsDetails);
        tv_type_callsDetails=view.findViewById(R.id.type_callsDetails);
        tv_contact_callsDetails=view.findViewById(R.id.contact_callsDetails);
        tv_call_purpose_callsDetails=view.findViewById(R.id.call_purpose_callsDetails);
        tv_callType_callsDetails=view.findViewById(R.id.calltype_callsDetails);
        tv_callDuration_callsDetails=view.findViewById(R.id.callDuration_callsDetails);
        tv_description_callsDetails=view.findViewById(R.id.description_callsDetails);
        tv_calResult_callsDetails=view.findViewById(R.id.callResult_callsDetails);
        tv_billable_callsDetails=view.findViewById(R.id.billable_callsDetails);
        tv_subject_callsDetails=view.findViewById(R.id.subject_callsDetails);

    }

}
