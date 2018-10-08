package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Activity;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.EventParticipents;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EventRepo {

    private Event event;
    public EventRepo()
    {
        event = new Event();
    }

    public static String createTable(){
        return "CREATE TABLE " + Event.TABLE_NAME +
                " (" + Event.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Event.KEY_LOCATIONS + " VARCHAR, " +
                Event.KEY_STARTDATE + " DATETIME, " +
                Event.KEY_ENDDATE + " DATETIME, " +
                Event.KEY_HOSTNAME + " VARCHAR, " +
                Event.KEY_EVENTNAME + " VARCHAR, " +
                Event.KEY_STARTTIME + " TIME, " +
                Event.KEY_ENDTIME + " TIME )" ;
    }

    public int insertInEvent(Event event1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Event.KEY_ID, event1.getID());
        values.put(Event.KEY_LOCATIONS, event1.getLocation());
        values.put(Event.KEY_STARTDATE, event1.getStartDate().toString());
        values.put(Event.KEY_ENDDATE, event1.getEndDate().toString());
        values.put(Event.KEY_HOSTNAME, event1.getHostName());
        values.put(Event.KEY_EVENTNAME, event1.getEventName());
        values.put(Event.KEY_STARTTIME, event1.getStartTime().toString());
        values.put(Event.KEY_ENDTIME, event1.getEndTime().toString());


        int EventId =(int)db.insert(Event.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return EventId;
    }

    public List<Event> getEventList() {

        Event GetEvent;
        List<Event> EventLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Event.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetEvent= new Event();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
                GetEvent.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Event.KEY_ID))));
                GetEvent.setLocation(cursor.getString(cursor.getColumnIndex(Event.KEY_LOCATIONS)));
                GetEvent.setHostName(cursor.getString(cursor.getColumnIndex(Event.KEY_HOSTNAME)));
                GetEvent.setEventName(cursor.getString(cursor.getColumnIndex(Event.KEY_EVENTNAME)));
                try {
                    GetEvent.setStartDate(sdf.parse(cursor.getString(cursor.getColumnIndex(Event.KEY_STARTDATE))));
                    GetEvent.setEndDate(sdf.parse(cursor.getString(cursor.getColumnIndex(Event.KEY_ENDDATE))));
                    GetEvent.setStartTime(time.parse(cursor.getString(cursor.getColumnIndex(Event.KEY_ENDTIME))));
                    GetEvent.setEndTime(time.parse(cursor.getString(cursor.getColumnIndex(Event.KEY_STARTTIME))));

                } catch (ParseException e) {
                    e.printStackTrace();
                }


                EventLists.add(GetEvent);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return EventLists;
    }

    public long deletefromEvent(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Event.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
