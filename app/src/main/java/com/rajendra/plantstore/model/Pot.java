
package com.rajendra.plantstore.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pot {

    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("price")
    @Expose
    private String price;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
