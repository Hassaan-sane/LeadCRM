package com.example.hassaan.leadcrm.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.AccountDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;
import com.example.hassaan.leadcrm.Fragments.LeadDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.LeadRelatedFragment;

public class LeadPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    int LeadPostion;

    public LeadPagerAdapter(FragmentManager fm, int mNumOfTabs, int LeadPostion) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
        this.LeadPostion=LeadPostion;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                LeadDetailsFragment leadDetailsFragment = new LeadDetailsFragment();

                Bundle data = new Bundle();//Use bundle to pass data
                data.putInt("LeadPostion",LeadPostion);//put string, int, etc in bundle with a key value
                leadDetailsFragment.setArguments(data);

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
