package com.example.hassaan.leadcrm.Repo;


import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.EventParticipents;
import com.example.hassaan.leadcrm.TableClasses.Participient;

public class EventParticipientRepo {
    private EventParticipents participients;
    public EventParticipientRepo() {
        participients = new EventParticipents();
    }

    public static String createTable() {
        return "CREATE TABLE " + EventParticipents.TABLE_NAME +
                " (" + EventParticipents.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                EventParticipents.KEY_PARTICIPENTSID + " VARCHAR, " +
                EventParticipents.KEY_EVENTID + " VARCHAR, "+
                "FOREIGN KEY (" + EventParticipents.KEY_PARTICIPENTSID + ") REFERENCES " + Participient.TABLE_NAME + "(" + Participient.KEY_ID + "), " +
                "FOREIGN KEY(" + EventParticipents.KEY_EVENTID + ") REFERENCES " + Event.TABLE_NAME + "(" + Event.KEY_ID + ") )";
    }
}
