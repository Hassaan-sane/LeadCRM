package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Participient;

public class ParticipientRepo {
    private Participient participient;
    public ParticipientRepo() {
        participient = new Participient();
    }

    public static String createTable() {
        return "CREATE TABLE " + Participient.TABLE_NAME +
                " (" + Participient.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Participient.KEY_Name + " VARCHAR)";
    }
}
