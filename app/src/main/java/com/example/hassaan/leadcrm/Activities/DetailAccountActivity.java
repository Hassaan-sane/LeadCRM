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

import com.example.hassaan.leadcrm.Adapters.AccountPagerAdapter;
import com.example.hassaan.leadcrm.Adapters.LeadPagerAdapter;
import com.example.hassaan.leadcrm.R;

public class DetailAccountActivity extends AppCompatActivity {

    private int AccountPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_account);

        Toolbar toolbar = findViewById(R.id.toolbar_account);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getIntent() != null) {
            AccountPosition = getIntent().getIntExtra("AccountPosition", 0);
        }

        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark)); //status bar or the time bar at the top

        TabLayout tabLayout = findViewById(R.id.tab_layout_account);
        tabLayout.addTab(tabLayout.newTab().setText("Account Details"));
        tabLayout.addTab(tabLayout.newTab().setText("Account Details2"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.pager_account);
        final AccountPagerAdapter accountPagerAdapter = new AccountPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount(),AccountPosition);
        viewPager.setAdapter(accountPagerAdapter);
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
            Intent intent = new Intent(getApplicationContext(), EditAccountActivity.class);
            intent.putExtra("AccountPosition",AccountPosition);
            startActivity(intent);
            finish();
        }


        return super.onOptionsItemSelected(item);
    }


}
