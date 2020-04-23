
package com.rajendra.plantstore.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recommended {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("category ")
    @Expose
    private String category;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("placement")
    @Expose
    private String placement;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("pot")
    @Expose
    private String pot;
    @SerializedName("dimention")
    @Expose
    private String dimention;
    @SerializedName("layer")
    @Expose
    private String layer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPot() {
        return pot;
    }

    public void setPot(String pot) {
        this.pot = pot;
    }

    public String getDimention() {
        return dimention;
    }

    public void setDimention(String dimention) {
        this.dimention = dimention;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

}
