package com.example.hassaan.leadcrm.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.AccountDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;
import com.example.hassaan.leadcrm.Fragments.LeadDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.LeadRelatedFragment;

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
                LeadRelatedFragment leadRelatedFragment = new LeadRelatedFragment();
                return  leadRelatedFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
