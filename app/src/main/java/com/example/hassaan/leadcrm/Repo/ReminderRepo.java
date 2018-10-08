package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.Priority;
import com.example.hassaan.leadcrm.TableClasses.Reminder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReminderRepo {

    private Reminder reminder;
    public ReminderRepo(){reminder = new Reminder();}

    public static String createTable() {
        return "CREATE TABLE " + Reminder.TABLE_NAME +
                " (" + Reminder.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Reminder.KEY_TIME + " TIME, " +
                Reminder.KEY_REPEAT + " VARCHAR, " +
                Reminder.KEY_AlERT + " VARCHAR " +
                ")";
    }

    public int insertInReminder(Reminder reminder1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Reminder.KEY_ID, reminder1.getID());
        values.put(Reminder.KEY_TIME, reminder1.getTime().toString());
        values.put(Reminder.KEY_REPEAT, reminder1.getRepeat());
        values.put(Reminder.KEY_AlERT, reminder1.getAlert());

        int ReminderId =(int)db.insert(Reminder.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return ReminderId;
    }

    public List<Reminder> getReminderList() {

        Reminder GetReminder;
        List<Reminder> ReminderLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Reminder.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetReminder= new Reminder();
                SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
                GetReminder.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Reminder.KEY_ID))));
                GetReminder.setRepeat(cursor.getString(cursor.getColumnIndex(Reminder.KEY_REPEAT)));
                GetReminder.setAlert(cursor.getString(cursor.getColumnIndex(Reminder.KEY_AlERT)));

                try {
                    GetReminder.setTime(time.parse(cursor.getString(cursor.getColumnIndex(Reminder.KEY_TIME))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }



                ReminderLists.add(GetReminder);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return ReminderLists;
    }

    public long deletefromReminder(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Reminder.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
