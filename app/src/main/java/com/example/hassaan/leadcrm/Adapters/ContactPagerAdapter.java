package com.example.hassaan.leadcrm.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.ContactDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.ContactRelatedFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;

public class ContactPagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;

    public ContactPagerAdapter(FragmentManager fm, int mNumofTabs) {
        super(fm);
        this.mNumofTabs = mNumofTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                ContactDetailsFragment  contactDetailsFragment = new ContactDetailsFragment() ;
                return contactDetailsFragment;
            case 1:
                ContactRelatedFragment contactRelatedFragment= new ContactRelatedFragment();
                return contactRelatedFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}
