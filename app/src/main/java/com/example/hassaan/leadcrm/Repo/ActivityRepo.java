package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Activity;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.Leads;
import com.example.hassaan.leadcrm.TableClasses.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
                Activity.KEY_ActivityStatus + " BOOLEAN, " +
                "FOREIGN KEY(" + Activity.KEY_EventID + ")REFERENCES " + Event.TABLE_NAME + "(" + Event.KEY_ID + "), " +
                "FOREIGN KEY(" + Activity.KEY_TaskID + ")REFERENCES " + Task.TABLE_NAME + "(" +Task.KEY_ID + "), " +
                "FOREIGN KEY(" + Activity.KEY_LeadID + ")REFERENCES " + Leads.TABLE_NAME + "(" +Leads.KEY_ID + ") )" ;
    }
    public int insertInActivity(Activity activity1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Activity.KEY_ID, activity1.getID());
        values.put(Activity.KEY_Subject, activity1.getSubject());
        values.put(Activity.KEY_TaskID, activity1.getTaskID());
        values.put(Activity.KEY_EventID, activity1.getEventID());
        values.put(Activity.KEY_LeadID, activity1.getLeadID());
        values.put(Activity.KEY_ModifiedDate, activity1.getModifiedDate().toString());
        values.put(Activity.KEY_ActivityStatus, activity1.getActivityStatus());


        int ActivityId =(int)db.insert(activity1.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return ActivityId;
    }

    public List<Activity> getActivityList() {

        Activity GetActivity;
        List<Activity> ActivityLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Activity.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetActivity = new Activity();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                GetActivity.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Activity.KEY_ID))));
                GetActivity.setTaskID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Activity.KEY_TaskID))));
                GetActivity.setLeadID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Activity.KEY_LeadID))));
                GetActivity.setEventID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Activity.KEY_EventID))));
                GetActivity.setSubject(cursor.getString(cursor.getColumnIndex(Activity.KEY_Subject)));
                GetActivity.setActivityStatus(Boolean.getBoolean(cursor.getString(cursor.getColumnIndex(Activity.KEY_ActivityStatus))));
                try {
                    GetActivity.setModifiedDate(sdf.parse(cursor.getString(cursor.getColumnIndex(Activity.KEY_ModifiedDate))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }


                ActivityLists.add(GetActivity);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return ActivityLists;
    }

    public long deletefromActivity(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Activity.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
