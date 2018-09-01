package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by 1305254 on 01-09-2018.
 */

public class Skin {
    @SerializedName("Prickly Heat")
    private ArrayList<Issues> pricklyHeatRemedyList = new ArrayList<>();
    @SerializedName("Stretch Marks")
    private ArrayList<Issues> stretchMarksRemedyList = new ArrayList<>();
    @SerializedName("Warts")
    private ArrayList<Issues> wartsRemedyList = new ArrayList<>();

    public ArrayList<Issues> getPricklyHeatRemedyList() {
        return pricklyHeatRemedyList;
    }

    public void setPricklyHeatRemedyList(ArrayList<Issues> pricklyHeatRemedyList) {
        this.pricklyHeatRemedyList = pricklyHeatRemedyList;
    }

    public ArrayList<Issues> getStretchMarksRemedyList() {
        return stretchMarksRemedyList;
    }

    public void setStretchMarksRemedyList(ArrayList<Issues> stretchMarksRemedyList) {
        this.stretchMarksRemedyList = stretchMarksRemedyList;
    }

    public ArrayList<Issues> getWartsRemedyList() {
        return wartsRemedyList;
    }

    public void setWartsRemedyList(ArrayList<Issues> wartsRemedyList) {
        this.wartsRemedyList = wartsRemedyList;
    }
}
