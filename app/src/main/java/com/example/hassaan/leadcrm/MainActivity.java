package com.example.hassaan.leadcrm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hassaan.leadcrm.App.app;
import com.example.hassaan.leadcrm.Data.DBHelper;
import com.example.hassaan.leadcrm.Data.DatabaseManager;

public class MainActivity extends AppCompatActivity {

   // private app ap;
   private static DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ap=new app();
        dbHelper = new DBHelper(this);
        DatabaseManager.initializeInstance(dbHelper);
    }
}
