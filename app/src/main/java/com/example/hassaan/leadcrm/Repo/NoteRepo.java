package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Leads;
import com.example.hassaan.leadcrm.TableClasses.Note;

public class NoteRepo {

    public Note note;
    public NoteRepo()
    {
        note = new Note();
    }

    public static String createTable (){
        return "CREATE TABLE" + Note.TABLE_NAME +
                " (" + Note.KEY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT , " +
                Note.KEY_TITLENAME + "VARCHAR, " +
                Note.KEY_DETAILS + "VARCHAR, " +
                Note.KEY_LEADID + "INTEGER, " +
                Note.CREATED_DATE + "DATETIME ,FOREIGN KEY(" + Note.KEY_LEADID + ")REFERENCES " + Leads.TABLE_NAME + "(" +Leads.KEY_ID + ") )" ;
    }
}
