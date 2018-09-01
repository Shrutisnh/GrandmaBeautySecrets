package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Face {
    @SerializedName("Fair Skin")
    private ArrayList<Issues> fairSkinRemedyList = new ArrayList<>();
    @SerializedName("To Lighten Dark Lips")
    private ArrayList<Issues> darkLipsLighteningRemedyList = new ArrayList<>();
    @SerializedName("Blackheads On Nose")
    private ArrayList<Issues> blackheadsRemovalRemedyList = new ArrayList<>();
    @SerializedName("Face Cleanser")
    private ArrayList<Issues> faceCleanserRemedyList = new ArrayList<>();
    @SerializedName("For Blemishes On Face")
    private ArrayList<Issues> blemishesRemovalRemedyList = new ArrayList<>();
    @SerializedName("Face Scrubber")
    private ArrayList<Issues> faceScrubberList = new ArrayList<>();
    @SerializedName("Acne")
    private ArrayList<Issues> acneRemedyList = new ArrayList<>();
    @SerializedName("Teeth Whitening")
    private ArrayList<Issues> teethWideningRemedyList = new ArrayList<>();

    public ArrayList<Issues> getFairSkinRemedyList() {
        return fairSkinRemedyList;
    }

    public void setFairSkinRemedyList(ArrayList<Issues> fairSkinRemedyList) {
        this.fairSkinRemedyList = fairSkinRemedyList;
    }

    public ArrayList<Issues> getDarkLipsLighteningRemedyList() {
        return darkLipsLighteningRemedyList;
    }

    public void setDarkLipsLighteningRemedyList(ArrayList<Issues> darkLipsLighteningRemedyList) {
        this.darkLipsLighteningRemedyList = darkLipsLighteningRemedyList;
    }

    public ArrayList<Issues> getBlackheadsRemovalRemedyList() {
        return blackheadsRemovalRemedyList;
    }

    public void setBlackheadsRemovalRemedyList(ArrayList<Issues> blackheadsRemovalRemedyList) {
        this.blackheadsRemovalRemedyList = blackheadsRemovalRemedyList;
    }

    public ArrayList<Issues> getFaceCleanserRemedyList() {
        return faceCleanserRemedyList;
    }

    public void setFaceCleanserRemedyList(ArrayList<Issues> faceCleanserRemedyList) {
        this.faceCleanserRemedyList = faceCleanserRemedyList;
    }

    public ArrayList<Issues> getBlemishesRemovalRemedyList() {
        return blemishesRemovalRemedyList;
    }

    public void setBlemishesRemovalRemedyList(ArrayList<Issues> blemishesRemovalRemedyList) {
        this.blemishesRemovalRemedyList = blemishesRemovalRemedyList;
    }

    public ArrayList<Issues> getFaceScrubberList() {
        return faceScrubberList;
    }

    public void setFaceScrubberList(ArrayList<Issues> faceScrubberList) {
        this.faceScrubberList = faceScrubberList;
    }

    public ArrayList<Issues> getAcneRemedyList() {
        return acneRemedyList;
    }

    public void setAcneRemedyList(ArrayList<Issues> acneRemedyList) {
        this.acneRemedyList = acneRemedyList;
    }

    public ArrayList<Issues> getTeethWideningRemedyList() {
        return teethWideningRemedyList;
    }

    public void setTeethWideningRemedyList(ArrayList<Issues> teethWideningRemedyList) {
        this.teethWideningRemedyList = teethWideningRemedyList;
    }
}
