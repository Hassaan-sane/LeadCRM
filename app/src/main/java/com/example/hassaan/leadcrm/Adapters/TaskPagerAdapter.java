package com.example.hassaan.leadcrm.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.HomeFragment;
import com.example.hassaan.leadcrm.Fragments.TaskDetailsFragment;

public class TaskPagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs,taskPosition;

    public TaskPagerAdapter(FragmentManager fm, int mNumofTabs, int taskPosition) {
        super(fm);
        this.mNumofTabs = mNumofTabs;
        this.taskPosition=taskPosition;
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                TaskDetailsFragment taskDetailsFragment = new TaskDetailsFragment();

                Bundle data = new Bundle();//Use bundle to pass data
                data.putInt("TaskPosition",taskPosition);//put string, int, etc in bundle with a key value
                taskDetailsFragment.setArguments(data);

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
