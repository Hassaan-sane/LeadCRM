package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.hassaan.leadcrm.Adapters.LeadPagerAdapter;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;

public class DetailLeadActivity extends AppCompatActivity {

    private int LeadPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lead);

        if (getIntent() != null) {
            LeadPosition = getIntent().getIntExtra("LeadPosition",0);
        }

        Toolbar toolbar1 = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark)); //status bar or the time bar at the top


        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Lead Details"));
        tabLayout.addTab(tabLayout.newTab().setText("Lead Related"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.pager);
        final LeadPagerAdapter leadPagerAdapter = new LeadPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount(),LeadPosition);
        viewPager.setAdapter(leadPagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.edit_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.btn_edit_menu) {
            Intent intent = new Intent(getApplicationContext(),EditLeadActivity.class);
            intent.putExtra("LeadPosition",LeadPosition);
            startActivity(intent);
            finish();
        }


        return super.onOptionsItemSelected(item);
    }
}
