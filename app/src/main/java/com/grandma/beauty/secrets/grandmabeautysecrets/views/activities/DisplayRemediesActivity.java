package com.grandma.beauty.secrets.grandmabeautysecrets.views.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.constants.AppConstants;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Remedy;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.BasePresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.DisplayRemediesPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.util.JSONUtil;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments.DisplayRemedyViewPagerFragment;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IDisplayRemedy;

import java.util.List;

public class DisplayRemediesActivity extends BaseActivity implements IDisplayRemedy, DisplayRemedyViewPagerFragment.OnFragmentInteractionListener {

    DisplayRemediesPresenter displayRemediesPresenter;
    int bodyIndex, issueIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bodyIndex = getIntent().getIntExtra(AppConstants.BODY_INDEX, 0);
        issueIndex = getIntent().getIntExtra(AppConstants.ISSUE_INDEX, 0);
        displayRemediesPresenter.hostFragment();
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_display_remedies;
    }

    @Override
    public void hostFragment() {
        DisplayRemedyViewPagerFragment displayRemedyViewPagerFragment = DisplayRemedyViewPagerFragment.newInstance(bodyIndex, issueIndex);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_container, displayRemedyViewPagerFragment).commit();
    }

    @Override
    public List<Remedy> getRemedyList(int bodyIndex, int issueIndex) {
        return new JSONUtil().getInstance(this).getRemedyList(bodyIndex,issueIndex);
    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    protected BasePresenter onCreateActivityPresenter() {
        displayRemediesPresenter = new DisplayRemediesPresenter(this);
        return displayRemediesPresenter;
    }
}
