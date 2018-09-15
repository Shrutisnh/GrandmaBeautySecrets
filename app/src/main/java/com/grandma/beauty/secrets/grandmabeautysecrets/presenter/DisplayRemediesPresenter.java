package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.util.JSONUtil;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.DisplayRemediesActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IDisplayRemedy;

public class DisplayRemediesPresenter extends BaseActivityPresenter {
    private IDisplayRemedy displayRemedyView;
    public DisplayRemediesPresenter(IDisplayRemedy displayRemedyView) {
        super(displayRemedyView);
        this.displayRemedyView = displayRemedyView;
    }

    public void hostFragment(){
        displayRemedyView.hostFragment();
    }


    public String getTitle(int position){
        switch (position){
            case 0:
                return ((DisplayRemediesActivity)displayRemedyView).getResources().getString(R.string.Eyes);
            case 1:
                return ((DisplayRemediesActivity)displayRemedyView).getResources().getString(R.string.Face);
            case 2:
                return ((DisplayRemediesActivity)displayRemedyView).getResources().getString(R.string.Hair);
            case 3:
                return ((DisplayRemediesActivity)displayRemedyView).getResources().getString(R.string.Arms_Legs);
            case 4:
                return ((DisplayRemediesActivity)displayRemedyView).getResources().getString(R.string.Skin);

        }
        return null;
    }

    public String getIssueTitle(int bodyIndex,int issueIndex){
        return new JSONUtil().getInstance((DisplayRemediesActivity)displayRemedyView).getIssueTitle(bodyIndex, issueIndex);
    }
}
