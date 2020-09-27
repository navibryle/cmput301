
package com.example.gearbook;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.EditText;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class AddGearFragment extends DialogFragment {
    private EditText date;
    private EditText maker;
    private EditText desc;
    private EditText price;
    private EditText comment;
    private GearList list;
    private OnFragmentInteractionListener listener;
    AddGearFragment(EditText dateRef,EditText makerRef,EditText descRef,
                    EditText priceRef,EditText commentRef,GearList argList){
        list = argList;
        //initialize references to input fields of the fragment
    }
    public interface OnFragmentInteractionListener {
        //this will be implemented in MainActivity checks for correctness of input
        //will also be done in main activity
        void addGear(String date,String maker,String desc,String price,String comment,GearList arglist);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener){
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.add_gear_fragment_layout, null);
        date = view.findViewById(R.id.date_editText);
        maker = view.findViewById(R.id.maker_editText);
        desc = view.findViewById(R.id.desc_editText);
        price = view.findViewById(R.id.price_editText);
        comment = view.findViewById(R.id.comment_editText);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        return builder
                .setView(view)
                .setTitle("Add Gear")
                .setNegativeButton("Cancel", null)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        listener.addGear(date.getText().toString(),maker.getText().toString(),
                                desc.getText().toString(), price.getText().toString(),
                                comment.getText().toString(),list);
                    }}).create();
    }
}
