package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.EventParticipents;
import com.example.hassaan.leadcrm.TableClasses.Participient;

public class EventParticipientRepo {
    private EventParticipents participients;
    public EventParticipientRepo() {
        participients = new EventParticipents();
    }

    public static String createTable() {
        return "CREATE TABLE " + Participient.TABLE_NAME +
                " (" + EventParticipents.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                EventParticipents.KEY_PARTICIPENTSID + " VARCHAR, " +
                EventParticipents.KEY_EVENTID + "VARCHAR )";
    }
}
