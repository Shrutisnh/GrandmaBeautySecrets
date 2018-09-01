package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by 1305254 on 01-09-2018.
 */

public class ArmsFeet {
    @SerializedName("Dark Inner Thighs")
    private ArrayList<Issues> darkInnerThighsRemedyList = new ArrayList<>();
    @SerializedName("Dark Underarms")
    private ArrayList<Issues> darkUnderArmsRemedyList = new ArrayList<>();
    @SerializedName("Dry and Rough Hands")
    private ArrayList<Issues> dryRoughHandsRemedyList = new ArrayList<>();
    @SerializedName("Fair Hands And Feet")
    private ArrayList<Issues> fairHandsFeetRemedyList = new ArrayList<>();
    @SerializedName("Tanning of hands and feet")
    private ArrayList<Issues> tanningHandsFeetRemedyList = new ArrayList<>();
    @SerializedName("Nail Growth")
    private ArrayList<Issues> nailGrowthRemedyList = new ArrayList<>();
    @SerializedName("Shiny Nails")
    private ArrayList<Issues> shinyNailsRemedyList = new ArrayList<>();

    public ArrayList<Issues> getDarkInnerThighsRemedyList() {
        return darkInnerThighsRemedyList;
    }

    public void setDarkInnerThighsRemedyList(ArrayList<Issues> darkInnerThighsRemedyList) {
        this.darkInnerThighsRemedyList = darkInnerThighsRemedyList;
    }

    public ArrayList<Issues> getDarkUnderArmsRemedyList() {
        return darkUnderArmsRemedyList;
    }

    public void setDarkUnderArmsRemedyList(ArrayList<Issues> darkUnderArmsRemedyList) {
        this.darkUnderArmsRemedyList = darkUnderArmsRemedyList;
    }

    public ArrayList<Issues> getDryRoughHandsRemedyList() {
        return dryRoughHandsRemedyList;
    }

    public void setDryRoughHandsRemedyList(ArrayList<Issues> dryRoughHandsRemedyList) {
        this.dryRoughHandsRemedyList = dryRoughHandsRemedyList;
    }

    public ArrayList<Issues> getFairHandsFeetRemedyList() {
        return fairHandsFeetRemedyList;
    }

    public void setFairHandsFeetRemedyList(ArrayList<Issues> fairHandsFeetRemedyList) {
        this.fairHandsFeetRemedyList = fairHandsFeetRemedyList;
    }

    public ArrayList<Issues> getTanningHandsFeetRemedyList() {
        return tanningHandsFeetRemedyList;
    }

    public void setTanningHandsFeetRemedyList(ArrayList<Issues> tanningHandsFeetRemedyList) {
        this.tanningHandsFeetRemedyList = tanningHandsFeetRemedyList;
    }

    public ArrayList<Issues> getNailGrowthRemedyList() {
        return nailGrowthRemedyList;
    }

    public void setNailGrowthRemedyList(ArrayList<Issues> nailGrowthRemedyList) {
        this.nailGrowthRemedyList = nailGrowthRemedyList;
    }

    public ArrayList<Issues> getShinyNailsRemedyList() {
        return shinyNailsRemedyList;
    }

    public void setShinyNailsRemedyList(ArrayList<Issues> shinyNailsRemedyList) {
        this.shinyNailsRemedyList = shinyNailsRemedyList;
    }
}
