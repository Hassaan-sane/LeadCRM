package com.example.hassaan.leadcrm.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.TableClasses.Leads;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeadDetailsFragment extends Fragment {

    TextView tv_leadsource_leadDetail, tv_industry_leadDetail;
    TextView tv_leadOwner_leadDetail, tv_company_leadDetail, tv_title_leadDetail, tv_mobile_leadDetail, tv_phone_leadDetail, tv_annualRevenue_leadDetail, tv_email_leadDetail;
    TextView tv_website_leadDetail, tv_noOfEmployee_leadDetail, tv_skypeId_leadDetail,tv_leadname_leadDetail;

    private List<Leads> Leadlist = new ArrayList<>();

    public LeadDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lead_details, container, false);

        createReferences(view);
        if (getArguments() != null) {

            LeadsRepo leadsRepo = new LeadsRepo();

            Leadlist=leadsRepo.getLeadsList();

            int getArgument = getArguments().getInt("LeadPostion");

            tv_leadOwner_leadDetail.setText(Leadlist.get(getArgument).getLeadOwner());
            tv_company_leadDetail.setText(Leadlist.get(getArgument).getCompanyName());
            tv_leadname_leadDetail.setText(Leadlist.get(getArgument).getLeadName());
            tv_title_leadDetail.setText(Leadlist.get(getArgument).getTitle());

        }

        return view;
    }

    private void createReferences(View view) {
        tv_leadOwner_leadDetail = view.findViewById(R.id.tv_leadOwner_leadDetail);
        tv_company_leadDetail = view.findViewById(R.id.tv_company_leadDetail);
        tv_title_leadDetail = view.findViewById(R.id.tv_title_leadDetail);
        tv_leadname_leadDetail=view.findViewById(R.id.tv_leadname_leadDetail);
        tv_mobile_leadDetail = view.findViewById(R.id.tv_mobile_leadDetail);
        tv_phone_leadDetail = view.findViewById(R.id.tv_phone_leadDetail);
        tv_annualRevenue_leadDetail = view.findViewById(R.id.tv_annualRevenue_leadDetail);
        tv_email_leadDetail = view.findViewById(R.id.tv_email_leadDetail);
        tv_website_leadDetail = view.findViewById(R.id.tv_website_leadDetail);
        tv_noOfEmployee_leadDetail = view.findViewById(R.id.tv_noOfEmployee_leadDetail);
        tv_skypeId_leadDetail = view.findViewById(R.id.tv_skypeId_leadDetail);
        tv_leadsource_leadDetail = view.findViewById(R.id.tv_leadSource_leadDetail);
        tv_industry_leadDetail = view.findViewById(R.id.tv_industry_leadDetail);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
