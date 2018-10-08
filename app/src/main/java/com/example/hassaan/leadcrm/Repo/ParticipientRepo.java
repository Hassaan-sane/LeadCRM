package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.LeadStatus;
import com.example.hassaan.leadcrm.TableClasses.Note;
import com.example.hassaan.leadcrm.TableClasses.Participient;

import java.util.ArrayList;
import java.util.List;

public class ParticipientRepo {
    private Participient participient;
    public ParticipientRepo() {
        participient = new Participient();
    }

    public static String createTable() {
        return "CREATE TABLE " + Participient.TABLE_NAME +
                " (" + Participient.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Participient.KEY_Name + " VARCHAR )";
    }
    public int insertInParticipient(Participient participient1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Participient.KEY_ID, participient1.getID());
        values.put(Participient.KEY_Name, participient1.getName());

        int ParticipientId =(int)db.insert(Participient.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return ParticipientId;
    }

    public List<Participient> getParticipientList() {

        Participient GetParticipient;
        List<Participient> ParticipientLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Participient.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetParticipient= new Participient();
                GetParticipient.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Participient.KEY_ID))));
                GetParticipient.setName(cursor.getString(cursor.getColumnIndex(Participient.KEY_Name)));


                ParticipientLists.add(GetParticipient);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return ParticipientLists;
    }

    public long deletefromParticipient(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Participient.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
