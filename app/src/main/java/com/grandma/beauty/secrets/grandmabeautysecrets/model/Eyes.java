package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Eyes {
    @SerializedName("Dark Circles")
    private ArrayList<Issues> darkCirclesRemedyList = new ArrayList<>();
    @SerializedName("Sunken Eyes")
    private ArrayList<Issues> sunkenEyesRemedyList = new ArrayList<>();
    @SerializedName("Puffiness")
    private ArrayList<Issues> puffinessRemedyList = new ArrayList<>();
    @SerializedName("Beautiful Eyes")
    private ArrayList<Issues> beautifulEyesRemedyList = new ArrayList<>();
    @SerializedName("Eyebrows To Grow")
    private ArrayList<Issues> eyebrowsToGrowRemedyList = new ArrayList<>();

    public ArrayList<Issues> getDarkCirclesRemedyList() {
        return darkCirclesRemedyList;
    }

    public void setDarkCirclesRemedyList(ArrayList<Issues> darkCirclesRemedyList) {
        this.darkCirclesRemedyList = darkCirclesRemedyList;
    }

    public ArrayList<Issues> getSunkenEyesRemedyList() {
        return sunkenEyesRemedyList;
    }

    public void setSunkenEyesRemedyList(ArrayList<Issues> sunkenEyesRemedyList) {
        this.sunkenEyesRemedyList = sunkenEyesRemedyList;
    }

    public ArrayList<Issues> getPuffinessRemedyList() {
        return puffinessRemedyList;
    }

    public void setPuffinessRemedyList(ArrayList<Issues> puffinessRemedyList) {
        this.puffinessRemedyList = puffinessRemedyList;
    }

    public ArrayList<Issues> getBeautifulEyesRemedyList() {
        return beautifulEyesRemedyList;
    }

    public void setBeautifulEyesRemedyList(ArrayList<Issues> beautifulEyesRemedyList) {
        this.beautifulEyesRemedyList = beautifulEyesRemedyList;
    }

    public ArrayList<Issues> getEyebrowsToGrowRemedyList() {
        return eyebrowsToGrowRemedyList;
    }

    public void setEyebrowsToGrowRemedyList(ArrayList<Issues> eyebrowsToGrowRemedyList) {
        this.eyebrowsToGrowRemedyList = eyebrowsToGrowRemedyList;
    }
}
