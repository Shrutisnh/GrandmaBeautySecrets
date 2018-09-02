package com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.grandma.beauty.secrets.grandmabeautysecrets.model.Issues;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments.DisplayRemedyFragment;

import java.util.ArrayList;

public class DisplayRemedyViewPagerAdapter extends FragmentPagerAdapter
{
    int bodyIndex;
    ArrayList<Issues> remedyList;
    public DisplayRemedyViewPagerAdapter(FragmentManager fm, int bodyIndex, ArrayList<Issues> remedyList) {
        super(fm);
        this.bodyIndex = bodyIndex;
        this.remedyList = remedyList;
    }

    @Override
    public Fragment getItem(int position) {
        return DisplayRemedyFragment.newInstance(bodyIndex,position);
    }

    @Override
    public int getCount() {
        return remedyList.size();
    }
}
