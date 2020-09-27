package com.example.gearbook;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddBtn {
    View rootView;
    Context curContext;
    final EditText date = rootView.findViewById(R.id.date_editText);
    final EditText maker = rootView.findViewById(R.id.maker_editText);
    final EditText desc = rootView.findViewById(R.id.desc_editText);
    final EditText price = rootView.findViewById(R.id.price_editText);
    final EditText comment = rootView.findViewById(R.id.comment_editText);
    final FloatingActionButton addGearButton = rootView.findViewById(curContext.id.add_gear_button_button);
    public AddBtn(View argView,Context argContext){
        rootView = argView;
        curContext = argContext;
    }
    addGearButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new AddGearFragment(date,maker,desc,price,comment)
                    .show(getSupportFragmentManager(), "ADD_GEAR");
        }
    });

}
