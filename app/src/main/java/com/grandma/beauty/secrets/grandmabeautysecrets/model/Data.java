package com.grandma.beauty.secrets.grandmabeautysecrets.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data{

    @SerializedName("Issue")
    private String issue;

    @SerializedName("Remedy")
    private List<Remedy> remedies;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public List<Remedy> getRemedies() {
        return remedies;
    }

    public void setRemedies(List<Remedy> remedies) {
        this.remedies = remedies;
    }
}
