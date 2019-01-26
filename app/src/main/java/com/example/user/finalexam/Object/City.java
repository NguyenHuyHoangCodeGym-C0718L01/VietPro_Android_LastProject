package com.example.user.finalexam.Object;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by User on 1/20/2018.
 */

public class City {
    @SerializedName("hanoi")
    private ArrayList<Event>hanoi;

    @SerializedName("hcm")
    private ArrayList<Event>hcm;

    public ArrayList<Event> getHanoi() {
        return hanoi;
    }

    public void setHanoi(ArrayList<Event> hanoi) {
        this.hanoi = hanoi;
    }

    public ArrayList<Event> getHcm() {
        return hcm;
    }

    public void setHcm(ArrayList<Event> hcm) {
        this.hcm = hcm;
    }
}
