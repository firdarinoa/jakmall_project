package com.example.firdasahidi.jakmall;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FirdaRinoa on 9/19/18.
 */

public class Adapter extends ArrayAdapter<Model> {
    public Adapter(@NonNull Context context, ArrayList<Model> models) {
        super(context, 0, models);
    }

    public View getView(int position, View convertView, ViewGroup parent){
    // Get the data item for this position
        Model model = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_listview, parent, false);
        }
        // Lookup view for data population
        TextView textView = (TextView) convertView.findViewById(R.id.text_listview);
        // Populate the data into the template view using the data object
        textView.setText(model.textview);
        // Return the completed view to render on screen
        return convertView;

    }
}
