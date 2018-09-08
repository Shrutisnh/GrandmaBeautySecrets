package com.grandma.beauty.secrets.grandmabeautysecrets.model;


import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("Issue")
    public String issue;
    @SerializedName("Remedy")
    public Remedy[] remedies;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Remedy[] getRemedies() {
        return remedies;
    }

    public void setRemedies(Remedy[] remedies) {
        this.remedies = remedies;
    }
}
