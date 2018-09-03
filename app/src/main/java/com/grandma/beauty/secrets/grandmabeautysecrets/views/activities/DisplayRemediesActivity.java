package com.grandma.beauty.secrets.grandmabeautysecrets.views.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.constants.AppConstants;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.ArmsFeet;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Eyes;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Face;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Hair;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Issues;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Skin;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.BasePresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.DisplayRemediesPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.util.JSONUtil;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments.DisplayRemedyFragment;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IDisplayRemedy;

import java.util.ArrayList;

public class DisplayRemediesActivity extends BaseActivity implements IDisplayRemedy, DisplayRemedyFragment.OnFragmentInteractionListener {

    DisplayRemediesPresenter displayRemediesPresenter;
    int bodyIndex, issueIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bodyIndex = getIntent().getIntExtra(AppConstants.BODY_INDEX, 0);
        issueIndex = getIntent().getIntExtra(AppConstants.ISSUE_INDEX, 0);

//        try {
//            InputStream inputStream = getAssets().open("Eyes.json");
//            String json = null;
//            int size = inputStream.available();
//            byte[] buffer = new byte[size];
//            inputStream.read(buffer);
//            inputStream.close();
//            json = new String(buffer, "UTF-8");
//        }catch (IOException e){
//
//        }
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
        ArrayList<Issues> remedyList = displayRemediesPresenter.getEyesRemediesList(bodyIndex, issueIndex);
        return remedyList;
    }
    @Override
    public Object getBodyIssueRemedyObject(int bodyIssue){
        switch (bodyIssue){
            case 0 :
                Eyes eyes = (Eyes) new JSONUtil().getInstance(this).parseJsonResponse(bodyIssue);
                return eyes;
            case 1:
                Face face = (Face)new JSONUtil().getInstance(this).parseJsonResponse(bodyIssue);
                return face;
            case 2:
                Hair hair = (Hair)new JSONUtil().getInstance(this).parseJsonResponse(bodyIssue);
                return hair;
            case 3:
                ArmsFeet armsFeet = (ArmsFeet)new JSONUtil().getInstance(this).parseJsonResponse(bodyIssue);
                return armsFeet;
            case 4:
                Skin skin = (Skin)new JSONUtil().getInstance(this).parseJsonResponse(bodyIssue);
                return skin;
        }
        return null;
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
