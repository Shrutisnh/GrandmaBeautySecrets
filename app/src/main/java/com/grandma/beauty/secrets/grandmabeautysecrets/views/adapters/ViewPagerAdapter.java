package com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments.ViewPagerFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
 private static final int NUM_ITEMS = 5;
 private Context context;
    public ViewPagerAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        return ViewPagerFragment.newInstance(position,String.valueOf(getPageTitle(position)));
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getResources().getString(R.string.Eyes);

            case 1:
                return context.getResources().getString(R.string.Face);

            case 2:
                return context.getResources().getString(R.string.Hair);

            case 3:
                return context.getResources().getString(R.string.Arms_Legs);

            case 4:
                return context.getResources().getString(R.string.Skin);

                default:
                    return context.getResources().getString(R.string.Eyes);
        }

    }

}
