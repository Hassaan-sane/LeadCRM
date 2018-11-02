package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.POIStatus;
import com.example.hassaan.leadcrm.TableClasses.Priority;
import com.example.hassaan.leadcrm.TableClasses.Reminder;
import com.example.hassaan.leadcrm.TableClasses.Role;
import com.example.hassaan.leadcrm.TableClasses.Status;
import com.example.hassaan.leadcrm.TableClasses.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TaskRepo {

    public Task task;

    public TaskRepo() {
        task = new Task();
    }

    public static String createTable() {
        return "CREATE TABLE " + Task.TABLE_NAME +
                "(" + Task.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Task.KEY_SUBJECT + " VARCHAR, " +
                Task.KEY_DUEDATE + " DATETIME, " +
                Task.KEY_OWNERNAME + " VARCHAR, " +
                Task.KEY_PRIORITYID + " INTEGER, " +
                Task.KEY_STATUSID + " INTEGER, " +
                " FOREIGN KEY (" + Task.KEY_PRIORITYID + ") REFERENCES " + Priority.TABLE_NAME + "(" + Priority.KEY_ID + ") , " +
                " FOREIGN KEY (" + Task.KEY_STATUSID + ") REFERENCES " + Status.TABLE_NAME + "(" + Status.KEY_ID + ") )";
    }
    public int insertInTask(Task task1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Task.KEY_ID, task1.getID());
        values.put(Task.KEY_SUBJECT, task1.getSubject());
        values.put(Task.KEY_DUEDATE, task1.getDueDate().toString());
        values.put(Task.KEY_OWNERNAME, task1.getOwnerName());
        values.put(Task.KEY_PRIORITYID, task1.getPriorityID());
        values.put(Task.KEY_STATUSID, task1.getStatusID());


        int TaskId =(int)db.insert(Task.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return TaskId;
    }

    public List<Task> getTaskList() {

        Task GetTask;
        List<Task> TaskLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Task.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetTask= new Task();
                SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
                GetTask.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Task.KEY_ID))));
                GetTask.setPriorityID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Task.KEY_PRIORITYID))));
                GetTask.setStatusID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Task.KEY_STATUSID))));
                GetTask.setSubject(cursor.getString(cursor.getColumnIndex(Task.KEY_SUBJECT)));
                GetTask.setOwnerName(cursor.getString(cursor.getColumnIndex(Task.KEY_OWNERNAME)));

                try {
                    GetTask.setDueDate(time.parse(cursor.getString(cursor.getColumnIndex(Task.KEY_DUEDATE))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }



                TaskLists.add(GetTask);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return TaskLists;
    }

    public long deletefromTask(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Task.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
    public void delete() {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(Task.TABLE_NAME, null, null);
        DatabaseManager.getInstance().closeDatabase();
    }

    public int updateTask(Task task){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Task.KEY_ID, task.getID());
        values.put(Task.KEY_SUBJECT, task.getSubject());
        values.put(Task.KEY_DUEDATE, task.getDueDate().toString());
        values.put(Task.KEY_OWNERNAME, task.getOwnerName());
        values.put(Task.KEY_PRIORITYID, task.getPriorityID());
        values.put(Task.KEY_STATUSID, task.getStatusID());


        int TaskId =(int)db.update(Task.TABLE_NAME, values,Task.KEY_ID + " = " + task.getID(), null);
        DatabaseManager.getInstance().closeDatabase();
        return TaskId;
    }
}
