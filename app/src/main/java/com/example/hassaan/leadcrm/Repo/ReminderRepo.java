package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Priority;
import com.example.hassaan.leadcrm.TableClasses.Reminder;

public class ReminderRepo {

    private Reminder reminder;
    public ReminderRepo(){reminder = new Reminder();}

    public static String createTable() {
        return "CREATE TABLE " + Reminder.TABLE_NAME +
                " (" + Reminder.KEY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Reminder.KEY_TIME + "DATETIME, " +
                Reminder.KEY_REPEAT + "VARCHAR, " +
                Reminder.KEY_AlERT + "VARCHAR " +
                ")";
    }
}
