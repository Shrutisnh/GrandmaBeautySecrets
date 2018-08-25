package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.BaseActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.ISplashView;

public class SplashPresenter extends BaseActivityPresenter{
    private ISplashView splashView;

    public SplashPresenter(ISplashView splashView) {
        super(splashView);
        this.splashView=splashView;
    }
    @Override
    public void onCreate(BaseActivity baseActivity) {
        super.onCreate(baseActivity);
        splashView.loadSplash();
    }
}
