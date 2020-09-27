package com.example.gearbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Queue;

public class GearListAdapter extends ArrayAdapter<Gear>{
    private ArrayList<Gear> list;
    private Context contextInstance;
    public GearListAdapter(Context context, ArrayList<Gear> gearList){
        super(context,0,gearList);
        contextInstance = context;
        list = gearList;
    }
    //this is an abstract method from the ArrayAdapter<Gear> inheritance tree
    public View getView(int position, View convertView, ViewGroup parent){
        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(contextInstance).inflate(R.layout.gear_list_disp,parent,false);
        }
        Gear curGear = list.get(position);
        ((TextView) view.findViewById(R.id.priceDisp)).setText(String.valueOf(curGear.getPrice()));
        ((TextView) view.findViewById(R.id.makerDisp)).setText(curGear.getMaker());
        ((TextView) view.findViewById(R.id.dateDisp)).setText(curGear.getDate().toString());
        return view;
    }
}
