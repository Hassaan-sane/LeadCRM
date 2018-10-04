package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Event;

public class EventRepo {

    private Event event;
    public EventRepo()
    {
        event = new Event();
    }

    public static String createTable(){
        return "CREATE TABLE" + Event.TABLE_NAME +
                " (" + Event.KEY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT , " +
                Event.KEY_LOCATIONS + "VARCHAR, " +
                Event.KEY_STARTDATE + "DATETIME, " +
                Event.KEY_ENDDATE + "DATETIME, " +
                Event.KEY_HOSTNAME + "VARCHAR, " +
                Event.KEY_EVENTNAME + "VARCHAR, " +
                Event.KEY_STARTTIME + "TIME, " +
                Event.KEY_ENDTIME + "TIME )" ;
    }
}
