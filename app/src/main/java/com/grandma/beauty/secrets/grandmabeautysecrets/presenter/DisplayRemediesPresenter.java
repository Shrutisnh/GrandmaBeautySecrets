package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IDisplayRemedy;

public class DisplayRemediesPresenter extends BaseActivityPresenter {
    IDisplayRemedy displayRemedyView;
    public DisplayRemediesPresenter(IDisplayRemedy displayRemedyView) {
        super(displayRemedyView);
        this.displayRemedyView = displayRemedyView;
        hostFragment();
    }

    public void hostFragment(){
        displayRemedyView.hostFragment();
    }
}
