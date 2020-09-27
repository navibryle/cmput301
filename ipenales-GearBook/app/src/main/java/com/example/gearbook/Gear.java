package com.example.gearbook;

import android.view.View;

import java.util.Date;

public class Gear {
    private Date date;
    String maker;
    String description;
    float price;
    String comment;

    public Date  getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }

    public String getDescription() {
        return description;
    }

    public String getMaker() {
        return maker;
    }
}
