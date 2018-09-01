package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by 1305254 on 01-09-2018.
 */

public class Hair {
    @SerializedName("Split Ends")
    private ArrayList<Issues> splitEndsRemedyList = new ArrayList<>();
    @SerializedName("Dandruff")
    private ArrayList<Issues> dandruffRemedyList = new ArrayList<>();
    @SerializedName("Grey Hair")
    private ArrayList<Issues> greyHairRemedyList = new ArrayList<>();
    @SerializedName("Natural Hair Conditioner")
    private ArrayList<Issues> naturalHairConditionerList = new ArrayList<>();
    @SerializedName("Loss Of Hair")
    private ArrayList<Issues> lossOfHairRemedyList = new ArrayList<>();
    @SerializedName("Head Lice")
    private ArrayList<Issues> headLiceRemedyList = new ArrayList<>();

    public ArrayList<Issues> getSplitEndsRemedyList() {
        return splitEndsRemedyList;
    }

    public void setSplitEndsRemedyList(ArrayList<Issues> splitEndsRemedyList) {
        this.splitEndsRemedyList = splitEndsRemedyList;
    }

    public ArrayList<Issues> getDandruffRemedyList() {
        return dandruffRemedyList;
    }

    public void setDandruffRemedyList(ArrayList<Issues> dandruffRemedyList) {
        this.dandruffRemedyList = dandruffRemedyList;
    }

    public ArrayList<Issues> getGreyHairRemedyList() {
        return greyHairRemedyList;
    }

    public void setGreyHairRemedyList(ArrayList<Issues> greyHairRemedyList) {
        this.greyHairRemedyList = greyHairRemedyList;
    }

    public ArrayList<Issues> getNaturalHairConditionerList() {
        return naturalHairConditionerList;
    }

    public void setNaturalHairConditionerList(ArrayList<Issues> naturalHairConditionerList) {
        this.naturalHairConditionerList = naturalHairConditionerList;
    }

    public ArrayList<Issues> getLossOfHairRemedyList() {
        return lossOfHairRemedyList;
    }

    public void setLossOfHairRemedyList(ArrayList<Issues> lossOfHairRemedyList) {
        this.lossOfHairRemedyList = lossOfHairRemedyList;
    }

    public ArrayList<Issues> getHeadLiceRemedyList() {
        return headLiceRemedyList;
    }

    public void setHeadLiceRemedyList(ArrayList<Issues> headLiceRemedyList) {
        this.headLiceRemedyList = headLiceRemedyList;
    }
}
