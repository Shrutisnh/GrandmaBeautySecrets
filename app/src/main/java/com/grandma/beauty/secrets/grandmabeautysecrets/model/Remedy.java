package com.grandma.beauty.secrets.grandmabeautysecrets.model;


import com.google.gson.annotations.SerializedName;

public class Remedy {
    @SerializedName("Ingredients")
    public String ingredients;
    @SerializedName("Procedure")
    public String[] procedure;

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }
}
