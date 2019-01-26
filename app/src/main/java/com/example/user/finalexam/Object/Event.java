package com.example.user.finalexam.Object;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by User on 1/20/2018.
 */

public class Event {
    @SerializedName("eat")
    private ArrayList<Info>eat;

    @SerializedName("play")
    private ArrayList<Info>play;

    @SerializedName("holiday")
    private ArrayList<Info>holiday;

    public ArrayList<Info> getEat() {
        return eat;
    }

    public void setEat(ArrayList<Info> eat) {
        this.eat = eat;
    }

    public ArrayList<Info> getPlay() {
        return play;
    }

    public void setPlay(ArrayList<Info> play) {
        this.play = play;
    }

    public ArrayList<Info> getHoliday() {
        return holiday;
    }

    public void setHoliday(ArrayList<Info> holiday) {
        this.holiday = holiday;
    }
}
