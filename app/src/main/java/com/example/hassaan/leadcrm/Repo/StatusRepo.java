package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Status;

public class StatusRepo {
    private Status status;
    public StatusRepo() {
        status = new Status();
    }

    public static String createTable() {
        return "CREATE TABLE " + Status.TABLE_NAME +
                " (" + Status.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Status.KEY_Name + " VARCHAR)";
    }
}
