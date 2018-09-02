package com.grandma.beauty.secrets.grandmabeautysecrets.views.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.constants.AppConstants;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Issues;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.DisplayRemediesPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments.DisplayRemedyFragment;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IDisplayRemedy;

import java.util.ArrayList;

public class DisplayRemediesActivity extends BaseActivity implements IDisplayRemedy {

    DisplayRemediesPresenter displayRemediesPresenter;
    int bodyIndex, issueIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayRemediesPresenter = new DisplayRemediesPresenter(this);
        bodyIndex = getIntent().getIntExtra(AppConstants.BODY_INDEX, 0);
        issueIndex = getIntent().getIntExtra(AppConstants.ISSUE_INDEX, 0);
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_display_remedies;
    }

    @Override
    public void hostFragment() {
        DisplayRemedyFragment displayRemedyFragment = DisplayRemedyFragment.newInstance(bodyIndex, issueIndex);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_container, displayRemedyFragment).commit();

    }

    @Override
    public ArrayList<Issues> getRemedyList(int bodyIndex, int issueIndex) {
      ArrayList<Issues> remedyList=displayRemediesPresenter.getEyesRemediesList(bodyIndex,issueIndex);
      return remedyList;
    }
}
