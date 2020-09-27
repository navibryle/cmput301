package com.example.gearbook;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import androidx.fragment.app.FragmentManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class AddBtn{
    GearList list;
    FragmentManager mainActivity;
    ArrayList<EditText> attList;
    public AddBtn(ArrayList<EditText> references,
                  FloatingActionButton argBtn,androidx.fragment.app.FragmentManager argActivity,
                  GearList argList) {
        attList = references;
        mainActivity = argActivity;
        list = argList;

        argBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this will be triggered when the add button is clicked
                new AddGearFragment(attList.get(0), attList.get(1),
                        attList.get(2), attList.get(3), attList.get(4),list)
                        .show(mainActivity, "ADD_GEAR");
            }
        });
    }

}
