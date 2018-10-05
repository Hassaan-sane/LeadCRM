package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Activity;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.Leads;
import com.example.hassaan.leadcrm.TableClasses.Task;

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
                Activity.KEY_LeadID + " INTEGER, " +
                Activity.KEY_ModifiedDate + " DATETIME, " +
                Activity.KEY_ActivityStatus + " BOOLEAN, FOREIGN KEY(" + Activity.KEY_EventID + ")REFERENCES " + Event.TABLE_NAME + "(" + Event.KEY_ID + "), " +
                "FOREIGN KEY(" + Activity.KEY_TaskID + ")REFERENCES " + Task.TABLE_NAME + "(" +Task.KEY_ID + "), " +
                "FOREIGN KEY(" + Activity.KEY_LeadID + ")REFERENCES " + Leads.TABLE_NAME + "(" +Leads.KEY_ID + ") )" ;
    }
}
