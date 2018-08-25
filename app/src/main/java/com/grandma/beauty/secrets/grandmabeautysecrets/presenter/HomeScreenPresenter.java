package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.BaseActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IHomeView;

public class HomeScreenPresenter extends BasePresenter {
    private IHomeView homeView;

    public HomeScreenPresenter(IHomeView homeView) {
        super(homeView);
        this.homeView = homeView;
    }

    @Override
    public void onCreate(BaseActivity baseActivity) {
        super.onCreate(baseActivity);

    }

    public void onTabSelected(int tab){

    }
}
