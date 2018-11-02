package com.example.hassaan.leadcrm;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DBHelper;
import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.Repo.PriorityRepo;
import com.example.hassaan.leadcrm.Repo.StatusRepo;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Priority;
import com.example.hassaan.leadcrm.TableClasses.Status;
import com.example.hassaan.leadcrm.TableClasses.Task;


public class app extends Application {

    private static Context context;
    private static DBHelper dbHelper;
    private static DatabaseManager databaseManager;

    @Override
    public void onCreate() {
        super.onCreate();

        context=this.getApplicationContext();
        dbHelper=new DBHelper(context);
        databaseManager.initialize(dbHelper);

        SharedPreferences wmbPreference = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = wmbPreference.getBoolean("FIRSTRUN", true);
        Log.e("OnCreate","App");
        if (isFirstRun)
        {
            insertSampleData();
            SharedPreferences.Editor editor = wmbPreference.edit();
            editor.putBoolean("FIRSTRUN", false);
            editor.commit();
        }

    }
    public static Context getContext() {
        return context;
    }

    private void insertSampleData() {

        Status status = new Status();
        StatusRepo statusRepo= new StatusRepo();


        statusRepo.delete();

        status.setName("Not Started");
        statusRepo.insertInStatus(status);
        status.setName("Deffered");
        statusRepo.insertInStatus(status);
        status.setName("In Progress");
        statusRepo.insertInStatus(status);
        status.setName("Completed");
        statusRepo.insertInStatus(status);
        status.setName("Waiting for Input");
        statusRepo.insertInStatus(status);


        PriorityRepo priorityRepo = new PriorityRepo();
        Priority priority = new Priority();

        priorityRepo.delete();

        priority.setName("Highest");
        priorityRepo.insertInPriority(priority);
        priority.setName("High");
        priorityRepo.insertInPriority(priority);
        priority.setName("Normal");
        priorityRepo.insertInPriority(priority);
        priority.setName("Low");
        priorityRepo.insertInPriority(priority);
        priority.setName("Lowest");
        priorityRepo.insertInPriority(priority);




    }

    /*  private static Context context;
    private static DBHelper dbHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        dbHelper = new DBHelper();
        DatabaseManager.initialize(dbHelper);
        SharedPreferences wmbPreference = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = wmbPreference.getBoolean("FIRSTRUN", true);
        Log.e("OnCreate","App");
        if (isFirstRun)
        {
            SharedPreferences.Editor editor = wmbPreference.edit();
            editor.putBoolean("FIRSTRUN", false);
            editor.commit();
        }



    }

    public static Context getContext() {
        return context;
    }*/
}
