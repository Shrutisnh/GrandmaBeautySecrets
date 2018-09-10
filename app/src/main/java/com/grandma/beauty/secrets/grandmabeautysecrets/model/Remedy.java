package com.grandma.beauty.secrets.grandmabeautysecrets.model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Remedy implements Serializable{
    @SerializedName("Procedure")
    private String procedure;
    @SerializedName("Ingredients")
    private List<String> ingredients;

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
