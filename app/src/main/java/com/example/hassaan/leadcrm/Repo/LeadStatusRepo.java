package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.EventParticipents;
import com.example.hassaan.leadcrm.TableClasses.LeadStatus;

import java.util.ArrayList;
import java.util.List;

public class LeadStatusRepo {
    private LeadStatus leadStatus;
    public LeadStatusRepo() {
        leadStatus = new LeadStatus();
    }

    public static String createTable() {
        return "CREATE TABLE " + LeadStatus.TABLE_NAME +
                " (" + LeadStatus.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                LeadStatus.KEY_LeadStatusName + " VARCHAR)";
    }
    public int insertInLeadStatus(LeadStatus leadStatus1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(LeadStatus.KEY_ID, leadStatus1.getID());
        values.put(LeadStatus.KEY_LeadStatusName, leadStatus1.getLeadStatusName());

        int LeadStatusId =(int)db.insert(LeadStatus.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return LeadStatusId;
    }
    public List<LeadStatus> getLeadStatusList() {

        LeadStatus GetLeadStatus;
        List<LeadStatus> LeadStatusLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + LeadStatus.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetLeadStatus= new LeadStatus();
                GetLeadStatus.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(LeadStatus.KEY_ID))));
                GetLeadStatus.setLeadStatusName(cursor.getString(cursor.getColumnIndex(LeadStatus.KEY_LeadStatusName)));


                LeadStatusLists.add(GetLeadStatus);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return LeadStatusLists;
    }

    public long deletefromLeadstatus(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(LeadStatus.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
