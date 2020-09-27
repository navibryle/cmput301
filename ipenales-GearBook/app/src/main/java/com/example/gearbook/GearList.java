package com.example.gearbook;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GearList {
    private ArrayAdapter <Gear> gearList;
    public GearList(ArrayAdapter <Gear> argGearList, ListView parent){
        //this constructor will
        gearList = argGearList;
        parent.setAdapter(gearList);
    }
    public void addGear(Gear newGear){
        gearList.add(newGear);
        gearList.notifyDataSetChanged();
    }
    public void removeGear(Gear oldGear){
        //position will be the index of the item to be removed in the adapter
        gearList.remove(oldGear);
        gearList.notifyDataSetChanged();
    }
}
