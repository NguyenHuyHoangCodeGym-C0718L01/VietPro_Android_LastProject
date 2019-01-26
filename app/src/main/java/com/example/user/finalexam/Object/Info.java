package com.example.user.finalexam.Object;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 1/20/2018.
 */

public class Info {
    @SerializedName("name")
    private String name;

    @SerializedName("price")
    private String price;

    @SerializedName("restaurant")
    private String restaurant;

    @SerializedName("address")
    private String address;

    @SerializedName("image")
    private String image;

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

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
