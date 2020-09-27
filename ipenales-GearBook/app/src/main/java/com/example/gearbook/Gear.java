package com.example.gearbook;

import android.view.View;

import java.util.Date;

public class Gear {
    private String date;
    private String maker;
    private String description;
    private String price;
    private String comment;
    Gear(String dateArg,String makerArg,String descriptionArg,String priceArg,String commentArg){
        date = dateArg;
        maker = makerArg;
        description = descriptionArg;
        price = priceArg;
        comment = commentArg;
    }
    public String  getDate() {
        return date;
    }

    public String  getPrice() {
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
