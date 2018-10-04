package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Leads;

public class LeadsRepo {

    private Leads leads;
    public LeadsRepo() {
        leads = new Leads();
    }

    public static String createTable() {
        return "CREATE TABLE " + Leads.TABLE_NAME +
                " (" + Leads.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Leads.KEY_LeadOwner + " VARCHAR, " +
                Leads.KEY_Title + " VARCHAR, " +
                Leads.KEY_Phone + " VARCHAR, "+
                Leads.KEY_Mobile + " VARCHAR, "+
                Leads.KEY_LeadSource + " VARCHAR, "+
                Leads.KEY_Industry + " VARCHAR, "+
                Leads.KEY_AnnualRevenue + " INTEGER, "+
                Leads.KEY_ModifiedBy + " DATE, "+
                Leads.KEY_CompanyName+ " VARCHAR, "+
                Leads.KEY_LeadName + " VARCHAR, "+
                Leads.KEY_Email + " VARCHAR, "+
                Leads.KEY_Website + " VARCHAR, "+
                Leads.KEY_LeadStatus + " INTEGER, "+
                Leads.KEY_No_of_Employees+ " INTEGER, "+
                Leads.KEY_CreatedBy + " VARCHAR, "+
                Leads.KEY_SkypeID + " VARCHAR)";
    }
}
