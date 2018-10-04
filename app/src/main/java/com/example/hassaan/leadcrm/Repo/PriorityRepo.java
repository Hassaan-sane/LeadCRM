package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Priority;

public class PriorityRepo {
    private Priority priority;
    public PriorityRepo() {
        priority = new Priority();
    }

    public static String createTable() {
        return "CREATE TABLE " + Priority.TABLE_NAME +
                " (" + Priority.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Priority.KEY_Name + " VARCHAR)";
    }
}
