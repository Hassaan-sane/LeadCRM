package com.example.hassaan.leadcrm.Repo;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Accounts;
import com.example.hassaan.leadcrm.TableClasses.Activity;
import com.example.hassaan.leadcrm.TableClasses.Contact;
import com.example.hassaan.leadcrm.TableClasses.LeadStatus;
import com.example.hassaan.leadcrm.TableClasses.Leads;
import com.example.hassaan.leadcrm.TableClasses.Note;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NoteRepo {

    public Note note;

    public NoteRepo() {
        note = new Note();
    }

    public static String createTable() {
        return "CREATE TABLE " + Note.TABLE_NAME +
                " (" + Note.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Note.KEY_TITLENAME + " VARCHAR, " +
                Note.KEY_DETAILS + " VARCHAR, " +
                Note.KEY_LEADID + " INTEGER, " +
                Note.KEY_CREATED_DATE + " DATETIME, " +
                Note.KEY_ACCOUNTID + " INTEGER, " +
                Note.KEY_CONTACTID + " INTEGER, " +
                "FOREIGN KEY (" + Note.KEY_LEADID + ") REFERENCES " + Leads.TABLE_NAME + "(" + Leads.KEY_ID + ")" +
                "FOREIGN KEY (" + Note.KEY_ACCOUNTID + ") REFERENCES " + Accounts.TABLE_NAME + "(" + Accounts.KEY_ID + ")" +
                "FOREIGN KEY (" + Note.KEY_CONTACTID + ") REFERENCES " + Contact.TABLE_NAME + "(" + Contact.KEY_ID + ") )";
    }

    public int insertInNotes(Note note1) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Note.KEY_ID, note1.getID());
        values.put(Note.KEY_TITLENAME, note1.getTitleName());
        values.put(Note.KEY_DETAILS, note1.getDetails());
        values.put(Note.KEY_LEADID, note1.getLeadID());
        values.put(Note.KEY_CREATED_DATE, note1.getCreatedDate().toString());
        values.put(Note.KEY_ACCOUNTID,note.getAccountID());
        values.put(Note.KEY_CONTACTID,note.getContactID());


        int NoteId = (int) db.insert(Note.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return NoteId;
    }

    public List<Note> getNoteList() {

        Note GetNote;
        List<Note> NoteLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Note.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetNote = new Note();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                GetNote.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Note.KEY_ID))));
                GetNote.setLeadID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Note.KEY_LEADID))));
                GetNote.setTitleName(cursor.getString(cursor.getColumnIndex(Note.KEY_TITLENAME)));
                GetNote.setDetails(cursor.getString(cursor.getColumnIndex(Note.KEY_DETAILS)));
                GetNote.setAccountID(cursor.getInt(cursor.getColumnIndex(Note.KEY_ACCOUNTID)));
                GetNote.setContactID(cursor.getInt(cursor.getColumnIndex(Note.KEY_CONTACTID)));

                try {
                    GetNote.setCreatedDate(sdf.parse(cursor.getString(cursor.getColumnIndex(Note.KEY_CREATED_DATE))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                NoteLists.add(GetNote);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return NoteLists;
    }

    public long deletefromNote(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs = {id.toString()};
        long deleteId = db.delete(note.TABLE_NAME, "ID=?", whereArgs);
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
