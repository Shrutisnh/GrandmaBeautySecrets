package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import com.grandma.beauty.secrets.grandmabeautysecrets.model.ArmsFeet;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Eyes;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Face;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Hair;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Issues;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Skin;
import com.grandma.beauty.secrets.grandmabeautysecrets.util.JSONUtil;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IDisplayRemedy;

import java.util.ArrayList;

public class DisplayRemediesPresenter extends BaseActivityPresenter {
    IDisplayRemedy displayRemedyView;

    public DisplayRemediesPresenter(IDisplayRemedy displayRemedyView) {
        super(displayRemedyView);
        this.displayRemedyView = displayRemedyView;
        hostFragment();
    }

    public void hostFragment() {
        displayRemedyView.hostFragment();
    }

    public Object getBodyIssueRemedyObject(int bodyIndex){
       switch (bodyIndex){
           case 0:
               Eyes eyesObject = (Eyes)displayRemedyView.getBodyIssueRemedyObject(bodyIndex);
               return eyesObject;
           case 1:
               Face faceObject = (Face) displayRemedyView.getBodyIssueRemedyObject(bodyIndex);
               return faceObject;
           case 2:
               Hair hairObject = (Hair)displayRemedyView.getBodyIssueRemedyObject(bodyIndex);
               return hairObject;
           case 3:
               ArmsFeet armsFeetObject = (ArmsFeet)displayRemedyView.getBodyIssueRemedyObject(bodyIndex);
               return armsFeetObject;
           case 4:
               Skin skinObject = (Skin)displayRemedyView.getBodyIssueRemedyObject(bodyIndex);
               return skinObject;
       }
       return null;
    }

    public ArrayList<Issues> getEyesRemediesList(int bodyIndex,int issueIndex){
        Eyes eyes = (Eyes)getBodyIssueRemedyObject(bodyIndex);
        ArrayList<Issues> remedyList=null;
        switch (issueIndex){
            case 0:
                remedyList = eyes.getDarkCirclesRemedyList();
                break;
            case 1:
                remedyList = eyes.getSunkenEyesRemedyList();
                break;
            case 2:
                remedyList = eyes.getPuffinessRemedyList();
                break;
            case 3:
                remedyList = eyes.getBeautifulEyesRemedyList();
                break;
            case 4:
                remedyList = eyes.getEyebrowsToGrowRemedyList();
                break;
        }
        return remedyList;
    }
    public ArrayList<Issues> getFaceRemediesList(int bodyIndex,int issueIndex){
        Face face = (Face) getBodyIssueRemedyObject(bodyIndex);
        ArrayList<Issues> remedyList=null;
        switch (issueIndex){
            case 0:
                remedyList = face.getFairSkinRemedyList();
                break;
            case 1:
                remedyList = face.getDarkLipsLighteningRemedyList();
                break;
            case 2:
                remedyList = face.getBlackheadsRemovalRemedyList();
                break;
            case 3:
                remedyList = face.getBlemishesRemovalRemedyList();
                break;
            case 4:
                remedyList = face.getFaceScrubberList();
                break;
            case 5:
                remedyList = face.getAcneRemedyList();
                break;
            case 6:
                remedyList = face.getTeethWideningRemedyList();
                break;
        }
        return remedyList;
    }
    public ArrayList<Issues> getHairRemediesList(int bodyIndex,int issueIndex){
        Hair hair = (Hair) getBodyIssueRemedyObject(bodyIndex);
        ArrayList<Issues> remedyList=null;
        switch (issueIndex){
            case 0:
                remedyList = hair.getSplitEndsRemedyList();
                break;
            case 1:
                remedyList = hair.getDandruffRemedyList();
                break;
            case 2:
                remedyList = hair.getGreyHairRemedyList();
                break;
            case 3:
                remedyList = hair.getNaturalHairConditionerList();
                break;
            case 4:
                remedyList = hair.getLossOfHairRemedyList();
                break;
            case 5:
                remedyList = hair.getHeadLiceRemedyList();
                break;
        }
        return remedyList;
    }
    public ArrayList<Issues> getArmsFeetRemediesList(int bodyIndex,int issueIndex){
        ArmsFeet armsFeet = (ArmsFeet) getBodyIssueRemedyObject(bodyIndex);
        ArrayList<Issues> remedyList=null;
        switch (issueIndex){
            case 0:
                remedyList = armsFeet.getDarkInnerThighsRemedyList();
                break;
            case 1:
                remedyList = armsFeet.getDarkUnderArmsRemedyList();
                break;
            case 2:
                remedyList = armsFeet.getDryRoughHandsRemedyList();
                break;
            case 3:
                remedyList = armsFeet.getFairHandsFeetRemedyList();
                break;
            case 4:
                remedyList = armsFeet.getTanningHandsFeetRemedyList();
                break;
            case 5:
                remedyList = armsFeet.getNailGrowthRemedyList();
                break;
            case 6:
                remedyList = armsFeet.getShinyNailsRemedyList();
                break;
        }
        return remedyList;
    }
    public ArrayList<Issues> getSkinRemediesList(int bodyIndex,int issueIndex){
        Skin skin = (Skin) getBodyIssueRemedyObject(bodyIndex);
        ArrayList<Issues> remedyList=null;
        switch (issueIndex){
            case 0:
                remedyList = skin.getPricklyHeatRemedyList();
                break;
            case 1:
                remedyList = skin.getStretchMarksRemedyList();
                break;
            case 2:
                remedyList = skin.getWartsRemedyList();
                break;
        }
        return remedyList;
    }


}
