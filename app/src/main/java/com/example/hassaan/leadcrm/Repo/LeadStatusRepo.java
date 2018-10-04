package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.LeadStatus;

public class LeadStatusRepo {
    private LeadStatus leadStatus;
    public LeadStatusRepo() {
        leadStatus = new LeadStatus();
    }

    public static String createTable() {
        return "CREATE TABLE " + LeadStatus.TABLE_NAME +
                " (" + LeadStatus.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                LeadStatus.KEY_LeadStatusName + " VARCHAR)";
    }
}
