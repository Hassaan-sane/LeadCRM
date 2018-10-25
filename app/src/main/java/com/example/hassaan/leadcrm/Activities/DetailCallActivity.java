package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hassaan.leadcrm.Adapters.CallPagerAdapter;
import com.example.hassaan.leadcrm.R;

public class DetailCallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_call);

        Toolbar toolbar = findViewById(R.id.toolbar_call);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark)); //status bar or the time bar at the top

        TabLayout tabLayout = findViewById(R.id.tab_layout_call);
        tabLayout.addTab(tabLayout.newTab().setText("Call Details"));
        tabLayout.addTab(tabLayout.newTab().setText("Call Details2"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.pager_call);
        final CallPagerAdapter callPagerAdapter = new CallPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(callPagerAdapter);
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
            Intent intent = new Intent(getApplicationContext(),EditCallActivity.class);
            startActivity(intent);
            finish();
        }


        return super.onOptionsItemSelected(item);
    }


}
