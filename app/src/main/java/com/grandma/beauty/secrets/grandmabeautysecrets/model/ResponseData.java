package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

public class ResponseData {
    @SerializedName("Eyes")
    private Eyes eyes;

    @SerializedName("Face")
    private Face face;

    @SerializedName("Hair")
    private Hair hair;

    @SerializedName("Arms & Feet")
    private ArmsFeet armsFeet;

    @SerializedName("Skin")
    private Skin skin;

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public ArmsFeet getArmsFeet() {
        return armsFeet;
    }

    public void setArmsFeet(ArmsFeet armsFeet) {
        this.armsFeet = armsFeet;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
