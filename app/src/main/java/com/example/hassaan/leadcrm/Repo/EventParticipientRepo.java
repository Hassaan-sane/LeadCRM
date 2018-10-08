package com.example.hassaan.leadcrm.Repo;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Accounts;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.EventParticipents;
import com.example.hassaan.leadcrm.TableClasses.Participient;

import java.util.ArrayList;
import java.util.List;

public class EventParticipientRepo {
    private EventParticipents eventparticipients;
    public EventParticipientRepo() {
        eventparticipients = new EventParticipents();
    }

    public static String createTable() {
        return "CREATE TABLE " + EventParticipents.TABLE_NAME +
                " (" + EventParticipents.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                EventParticipents.KEY_PARTICIPENTSID + " INTEGER, " +
                EventParticipents.KEY_EVENTID + " INTEGER, "+
                "FOREIGN KEY (" + EventParticipents.KEY_PARTICIPENTSID + ") REFERENCES " + Participient.TABLE_NAME + "(" + Participient.KEY_ID + "), " +
                "FOREIGN KEY(" + EventParticipents.KEY_EVENTID + ") REFERENCES " + Event.TABLE_NAME + "(" + Event.KEY_ID + ") )";
    }
    public int insertInEventParticipient(EventParticipents eventParticipents1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(EventParticipents.KEY_ID, eventParticipents1.getID());
        values.put(EventParticipents.KEY_PARTICIPENTSID, eventParticipents1.getParticipentsID());
        values.put(EventParticipents.KEY_EVENTID, eventParticipents1.getEventID());

        int EventParticipientId =(int)db.insert(EventParticipents.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return EventParticipientId;
    }
    public List<EventParticipents> getEventParticipientList() {

        EventParticipents GetEventParticipents;
        List<EventParticipents> EventParticipentsLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + EventParticipents.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetEventParticipents= new EventParticipents();
                GetEventParticipents.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(EventParticipents.KEY_ID))));
                GetEventParticipents.setParticipentsID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(EventParticipents.KEY_PARTICIPENTSID))));
                GetEventParticipents.setEventID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(EventParticipents.KEY_EVENTID))));


                EventParticipentsLists.add(GetEventParticipents);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return EventParticipentsLists;
    }

    public long deletefromEventParticipients(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(EventParticipents.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
