package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

public class ResponseData {
    @SerializedName("Eyes")
    public Eyes eyes;

    @SerializedName("Face")
    public Face face;

    @SerializedName("Hair")
    public Hair hair;

    @SerializedName(" Arms & Feet")
    public ArmsFeet armsFeet;

    @SerializedName("Skin")
    public Skin skin;

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
