package com.example.hassaan.leadcrm.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.AccountDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;
import com.example.hassaan.leadcrm.Fragments.LeadDetailsFragment;

public class LeadPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public LeadPagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                LeadDetailsFragment leadDetailsFragment = new LeadDetailsFragment();
                return leadDetailsFragment;

            case 1:
                HomeFragment homeFragment = new HomeFragment();
                return  homeFragment;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
