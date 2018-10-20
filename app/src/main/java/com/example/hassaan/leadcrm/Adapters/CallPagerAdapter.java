package com.example.hassaan.leadcrm.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.CallDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;

public class CallPagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;

    public CallPagerAdapter(FragmentManager fm, int mNumofTabs) {
        super(fm);
        this.mNumofTabs = mNumofTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                CallDetailsFragment callDetailsFragment = new CallDetailsFragment();
                return callDetailsFragment;
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
