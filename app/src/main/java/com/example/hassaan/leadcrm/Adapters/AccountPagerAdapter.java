package com.example.hassaan.leadcrm.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hassaan.leadcrm.Fragments.AccountDetailsFragment;
import com.example.hassaan.leadcrm.Fragments.AccountRelatedFragment;
import com.example.hassaan.leadcrm.Fragments.HomeFragment;

public class AccountPagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;
    int AccountPosition;


    public AccountPagerAdapter(FragmentManager fm, int mNumofTabs, int AccountPosition) {
        super(fm);
        this.mNumofTabs = mNumofTabs;
        this.AccountPosition = AccountPosition;

    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                AccountDetailsFragment accountDetailsFragment = new AccountDetailsFragment();
                Bundle data = new Bundle();//Use bundle to pass data
                data.putInt("AccountPostion", AccountPosition);//put string, int, etc in bundle with a key value
                accountDetailsFragment.setArguments(data);

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
