package com.example.hassaan.leadcrm.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.hassaan.leadcrm.Adapters.LeadPagerAdapter;
import com.example.hassaan.leadcrm.R;

public class DetailAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_account);

        Toolbar toolbar= findViewById(R.id.toolbar_account);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark)); //status bar or the time bar at the top

        TabLayout tabLayout = findViewById(R.id.tab_layout_account);
        tabLayout.addTab(tabLayout.newTab().setText("Account Details"));
        tabLayout.addTab(tabLayout.newTab().setText("Account Details2"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.pager_account);
        final LeadPagerAdapter leadPagerAdapter= new LeadPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
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


}
