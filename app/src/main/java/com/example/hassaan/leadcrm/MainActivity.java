package com.example.hassaan.leadcrm;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.hassaan.leadcrm.Data.DBHelper;
import com.example.hassaan.leadcrm.Fragments.AboutusFragment;
import com.example.hassaan.leadcrm.Fragments.AccountDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.AccountsFragment;
import com.example.hassaan.leadcrm.Fragments.CallsFragment;
import com.example.hassaan.leadcrm.Fragments.ContactsFragment;
import com.example.hassaan.leadcrm.Fragments.DealsFragment;
import com.example.hassaan.leadcrm.Fragments.EventsFragment;
import com.example.hassaan.leadcrm.Fragments.FeedbackFragment;
import com.example.hassaan.leadcrm.Fragments.FeedsFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;
import com.example.hassaan.leadcrm.Fragments.LeadsFragment;
import com.example.hassaan.leadcrm.Fragments.SettingsFragment;
import com.example.hassaan.leadcrm.Fragments.TasksFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DBHelper dbHelper;
    DrawerLayout drawer;
//
//    EditText edit1, edit2, edit3;
//
//    Button button, button2;
//
//    TextView view1, view2, view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //self code
        dbHelper = new DBHelper(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        getSupportActionBar().setTitle("Home");
//        edit1 = findViewById(R.id.et1);
//        edit2 = findViewById(R.id.et2);
//        edit3 = findViewById(R.id.et3);
//
//        view1 = findViewById(R.id.tv1);
//        view2 = findViewById(R.id.tv2);
//        view3 = findViewById(R.id.tv3);
//
//        button = findViewById(R.id.btt1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                updateData();
//            }
//        });
//
//        button2 = findViewById(R.id.btt2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Cursor res = dbHelper.getAllData();
//                if (res.getCount() == 0) {
//                    Toast.makeText(MainActivity.this, "No Data Found", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                StringBuffer stringBuffer = new StringBuffer();
//                while (res.moveToNext()) {
//                    stringBuffer.append("Title :" + res.getString(2) + "\n");
//                    stringBuffer.append("Phone :" + res.getString(3) + "\n");
//                    stringBuffer.append("Mobile :" + res.getString(4) + "\n");
//                }
//
//                view1.setText(stringBuffer.toString());
//            }
//        });
        //self code ends here
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main2, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_home) {
            fragmentManager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();
            getSupportActionBar().setTitle("Home");

        } else if (id == R.id.nav_feeds) {

            fragmentManager.beginTransaction().replace(R.id.container, new FeedsFragment()).commit();
            getSupportActionBar().setTitle("Feeds");

        } else if (id == R.id.nav_leads) {

//            Intent intent=new Intent(this,ListViewsActivity.class);
//            startActivity(intent);

            fragmentManager.beginTransaction().replace(R.id.container, new LeadsFragment()).commit();
            getSupportActionBar().setTitle("Leads");

        } else if (id == R.id.nav_contacts) {

            fragmentManager.beginTransaction().replace(R.id.container, new ContactsFragment()).commit();
            getSupportActionBar().setTitle("Contacts");

        } else if (id == R.id.nav_accounts) {
            fragmentManager.beginTransaction().replace(R.id.container, new AccountsFragment()).commit();
            getSupportActionBar().setTitle("Accounts");

        } else if (id == R.id.nav_deals) {
            fragmentManager.beginTransaction().replace(R.id.container, new DealsFragment()).commit();
            getSupportActionBar().setTitle("Deals");

        } else if (id == R.id.nav_tasks) {

            fragmentManager.beginTransaction().replace(R.id.container, new TasksFragment()).commit();
            getSupportActionBar().setTitle("Tasks");

        } else if (id == R.id.nav_events) {

            fragmentManager.beginTransaction().replace(R.id.container, new EventsFragment()).commit();
            getSupportActionBar().setTitle("Events");

        } else if (id == R.id.nav_Calls) {

            fragmentManager.beginTransaction().replace(R.id.container, new CallsFragment()).commit();
            getSupportActionBar().setTitle("Calls");

        } else if (id == R.id.nav_settings) {

            fragmentManager.beginTransaction().replace(R.id.container, new SettingsFragment()).commit();
            getSupportActionBar().setTitle("Settings");

        } else if (id == R.id.nav_feedback) {

            fragmentManager.beginTransaction().replace(R.id.container, new FeedbackFragment()).commit();
            getSupportActionBar().setTitle("Feedback");

        } else if (id == R.id.nav_aboutus) {

            fragmentManager.beginTransaction().replace(R.id.container, new AboutusFragment()).commit();
            getSupportActionBar().setTitle("About Us");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void updateData() {
//        String a = edit1.getText().toString();
//        String b = edit2.getText().toString();
//        String c = edit3.getText().toString();
//
//        boolean isInserted = dbHelper.insertData(a, b, c);
//        if (isInserted) {
//            Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(MainActivity.this, "Data NOT Inserted", Toast.LENGTH_SHORT).show();
//        }
    }

}
