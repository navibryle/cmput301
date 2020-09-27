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
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AddGearFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        new AddBtn(new ArrayList<EditText>(){
            {
                add((EditText)findViewById(R.id.date_editText));
                add((EditText)findViewById(R.id.maker_editText));
                add((EditText)findViewById(R.id.desc_editText));
                add((EditText)findViewById(R.id.price_editText));
                add((EditText)findViewById(R.id.comment_editText));
            }
        },(FloatingActionButton) findViewById(R.id.add_gear_button),getSupportFragmentManager());
        setContentView(R.layout.activity_main);
    }
    //need to call setAdapter on the listView so that each element has the view
    @Override
    public void addGear(String date,String maker,String desc,String price,String comment){

    }
}