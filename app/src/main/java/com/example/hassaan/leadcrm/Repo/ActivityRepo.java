package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Activity;

public class ActivityRepo {
    private Activity activity;
    public ActivityRepo() {
        activity = new Activity();
    }

    public static String createTable() {
        return "CREATE TABLE " + Activity.TABLE_NAME +
                " (" + Activity.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Activity.KEY_Subject + " VARCHAR, " +
                Activity.KEY_TaskID + " INTEGER, " +
                Activity.KEY_EventID + " INTEGER, " +
                Activity.KEY_ModifiedDate + " DATETIME, " +
                Activity.KEY_ActivityStatus + " BOOLEAN) ";
    }
}
