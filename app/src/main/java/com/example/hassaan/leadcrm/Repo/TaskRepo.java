package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Task;

public class TaskRepo {

    public Task task;
    private TaskRepo(){task = new Task();}

    public static String createTable() {
        return "CREATE TABLE " + Task.TABLE_NAME +
                " (" + Task.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Task.KEY_SUBJECT + " VARCHAR, " +
                Task.KEY_DUEDATE + " DATETIME, " +
                Task.KEY_PRIORITYID + " INTEGER , " +
                Task.KEY_OWNERNAME + " VARCHAR , " +
                Task.KEY_STATUSID + " INTEGER " +
                ")";
    }
}
