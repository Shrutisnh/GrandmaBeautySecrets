package com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grandma.beauty.secrets.grandmabeautysecrets.model.Issues;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Remedy;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments.DisplayRemedyFragment;

import java.util.ArrayList;
import java.util.List;

public class DisplayRemedyViewPagerAdapter extends FragmentStatePagerAdapter
{
    int bodyIndex;
    List<Remedy> remedyList;
    public DisplayRemedyViewPagerAdapter(FragmentManager fm, int bodyIndex, List<Remedy> remedyList) {
        super(fm);
        this.bodyIndex = bodyIndex;
        this.remedyList = remedyList;
    }

    @Override
    public Fragment getItem(int position) {
        return DisplayRemedyFragment.newInstance(bodyIndex,position, (ArrayList)remedyList);
    }

    @Override
    public int getCount() {
        return remedyList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
