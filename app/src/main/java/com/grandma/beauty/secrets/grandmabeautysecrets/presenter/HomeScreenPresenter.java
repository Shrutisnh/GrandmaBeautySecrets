package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.BaseActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IHomeView;

public class HomeScreenPresenter extends BaseActivityPresenter {
    private IHomeView homeView;

    public HomeScreenPresenter(IHomeView homeView) {
        super(homeView);
        this.homeView = homeView;
    }

    @Override
    public void onCreate(BaseActivity baseActivity) {
        super.onCreate(baseActivity);

    }

    public void setTabStyle(){
        homeView.setTabStyle();
    }

    public void setMenuActionShare(){
        homeView.setMenuActionShare();
    }

    public void setMenuActionRate(){
        homeView.setMenuActionRate();
    }

    public void setDisplayRemedyList(int issueIndexId){
        homeView.displayIssuesRemedyList(issueIndexId);
    }


}
