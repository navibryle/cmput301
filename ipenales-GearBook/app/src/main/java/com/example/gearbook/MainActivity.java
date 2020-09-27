package com.example.gearbook;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AddGearFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GearList list = new GearList(new GearListAdapter(this,new ArrayList<Gear>()),
                (ListView) findViewById(R.id.GearListXml));
        FloatingActionButton addBtn = findViewById(R.id.add_gear_button);
        new AddBtn(new ArrayList<EditText>(){
            {
                add((EditText)findViewById(R.id.date_editText));
                add((EditText)findViewById(R.id.maker_editText));
                add((EditText)findViewById(R.id.desc_editText));
                add((EditText)findViewById(R.id.price_editText));
                add((EditText)findViewById(R.id.comment_editText));
            }
        },addBtn,getSupportFragmentManager(),list);
    }

    //need to call setAdapter on the listView so that each element has the view
    @Override
    public void addGear(String date,String maker,String desc,String price,String comment,GearList list){
        list.addGear(new Gear(date,maker,desc,price,comment));
    }
}