package com.example.hassaan.leadcrm.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.HomeFragment;
import com.example.hassaan.leadcrm.Fragments.TaskDetailsFragment;

public class TaskPagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;

    public TaskPagerAdapter(FragmentManager fm, int mNumofTabs) {
        super(fm);
        this.mNumofTabs = mNumofTabs;
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                TaskDetailsFragment taskDetailsFragment = new TaskDetailsFragment();
                return taskDetailsFragment;
            case 1:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}
