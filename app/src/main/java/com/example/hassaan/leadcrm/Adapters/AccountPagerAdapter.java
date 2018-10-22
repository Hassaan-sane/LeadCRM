package com.example.hassaan.leadcrm.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.AccountDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.AccountRelatedFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;

public class AccountPagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;


    public AccountPagerAdapter(FragmentManager fm, int mNumofTabs) {
        super(fm);
        this.mNumofTabs = mNumofTabs;

    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                AccountDetailsFragment accountDetailsFragment = new AccountDetailsFragment();
                return accountDetailsFragment;
            case 1:
                AccountRelatedFragment accountRelatedFragment = new AccountRelatedFragment();
                return accountRelatedFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}
