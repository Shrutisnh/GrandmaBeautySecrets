package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Skin {
    @SerializedName("data")
    public List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
