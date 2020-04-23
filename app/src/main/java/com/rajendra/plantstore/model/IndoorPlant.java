
package com.rajendra.plantstore.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IndoorPlant {

    @SerializedName("recommended")
    @Expose
    private List<Recommended> recommended = null;
    @SerializedName("pots")
    @Expose
    private List<Pot> pots = null;

    public List<Recommended> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<Recommended> recommended) {
        this.recommended = recommended;
    }

    public List<Pot> getPots() {
        return pots;
    }

    public void setPots(List<Pot> pots) {
        this.pots = pots;
    }

}
