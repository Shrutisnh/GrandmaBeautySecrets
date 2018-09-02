package com.grandma.beauty.secrets.grandmabeautysecrets.views.activities;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.constants.AppConstants;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.BasePresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.SplashPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.ISplashView;

public class SplashActivity extends BaseActivity implements ISplashView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter onCreateActivityPresenter() {
        return new SplashPresenter(this);
    }

    @Override
    public void loadSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadHomeScreen();
            }
        }, AppConstants.TIME_OUT);
    }

    @Override
    public void loadHomeScreen() {
        Intent loadHomeScreen = new Intent(this, HomeScreenActivity.class);
        startActivity(loadHomeScreen);
        finish();
    }
}
