package com.example.hassaan.leadcrm.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hassaan.leadcrm.App.app;
import com.example.hassaan.leadcrm.Repo.AccountsRepo;
import com.example.hassaan.leadcrm.Repo.ActivityRepo;
import com.example.hassaan.leadcrm.Repo.EventParticipientRepo;
import com.example.hassaan.leadcrm.Repo.EventRepo;
import com.example.hassaan.leadcrm.Repo.LeadStatusRepo;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.Repo.NoteRepo;
import com.example.hassaan.leadcrm.Repo.POIStatusRepo;
import com.example.hassaan.leadcrm.Repo.ParticipientRepo;
import com.example.hassaan.leadcrm.Repo.PriorityRepo;
import com.example.hassaan.leadcrm.Repo.ReminderRepo;
import com.example.hassaan.leadcrm.Repo.RoleRepo;
import com.example.hassaan.leadcrm.Repo.StatusRepo;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Accounts;
import com.example.hassaan.leadcrm.TableClasses.Activity;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.LeadStatus;
import com.example.hassaan.leadcrm.TableClasses.Leads;
import com.example.hassaan.leadcrm.TableClasses.Note;
import com.example.hassaan.leadcrm.TableClasses.POIStatus;
import com.example.hassaan.leadcrm.TableClasses.Participient;
import com.example.hassaan.leadcrm.TableClasses.Priority;
import com.example.hassaan.leadcrm.TableClasses.Reminder;
import com.example.hassaan.leadcrm.TableClasses.Role;
import com.example.hassaan.leadcrm.TableClasses.Status;
import com.example.hassaan.leadcrm.TableClasses.Task;

public class DBHelper extends SQLiteOpenHelper {
    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION =1;
    // Database Name
    private static final String DATABASE_NAME = "leadcrm.db";
    private Context context;



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
       // this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ParticipientRepo.createTable());
        db.execSQL(POIStatusRepo.createTable());
        db.execSQL(PriorityRepo.createTable());
        db.execSQL(ReminderRepo.createTable());
        db.execSQL(RoleRepo.createTable());
        db.execSQL(StatusRepo.createTable());
        db.execSQL(TaskRepo.createTable());
        db.execSQL(AccountsRepo.createTable());
        db.execSQL(EventRepo.createTable());
        db.execSQL(LeadsRepo.createTable());
        db.execSQL(EventParticipientRepo.createTable());
        db.execSQL(NoteRepo.createTable());
        db.execSQL(LeadStatusRepo.createTable());
        db.execSQL(ActivityRepo.createTable());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + Leads.TABLE_NAME + Event.TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData (String title, String phone, String mobile)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Leads.KEY_Title, title);
        cv.put(Leads.KEY_Phone, phone);
        cv.put(Leads.KEY_Mobile, mobile);
        long result = db.insert(Leads.TABLE_NAME, null, cv);

        if(result == -1)
        {
            return false;
        }
        else
        {return true;}
    }

    public Cursor getAllData()
    {
        SQLiteDatabase db = getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+Leads.TABLE_NAME, null);
        return res;
    }

}
