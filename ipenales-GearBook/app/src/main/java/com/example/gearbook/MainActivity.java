package com.example.gearbook;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements AddGearFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        final EditText date = findViewById(R.id.date_editText);
        final EditText maker = findViewById(R.id.maker_editText);
        final EditText desc = findViewById(R.id.desc_editText);
        final EditText price = findViewById(R.id.price_editText);
        final EditText comment = findViewById(R.id.comment_editText);
        final FloatingActionButton addCityButton = findViewById(R.id.add_city_button);
        setContentView(R.layout.activity_main);
    }
    //need to call setAdapter on the listView so that each element has the view
    @Override
    public void addGear(String date,String maker,String desc,String price,String comment){

    }
}