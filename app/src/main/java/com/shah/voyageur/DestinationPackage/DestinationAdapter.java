package com.shah.voyageur.DestinationPackage;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shah.voyageur.DestinationPackage.Destination;
import com.shah.voyageur.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 20-12-2017.
 */

public class DestinationAdapter extends ArrayAdapter<Destination> {

    private int mColorResourceId;

    public DestinationAdapter(Activity context, ArrayList<Destination> destinations, int colorResourceId){
        super(context,0,destinations);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.destination_list_item ,parent,false);
        }

        Destination currentDestination = getItem(position);

        ImageView destinationImage = (ImageView)listItemView.findViewById(R.id.destination_image);
        destinationImage.setImageResource(currentDestination.getImageResourceID());
        destinationImage.setVisibility(View.VISIBLE);

        TextView destinationName = (TextView)listItemView.findViewById(R.id.destination_name);
        destinationName.setText(currentDestination.getDestinationName());

        TextView destinationSeason = (TextView)listItemView.findViewById(R.id.destination_season);
        destinationSeason.setText(currentDestination.getSeason());

        View destinationContainer = listItemView.findViewById(R.id.destination_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        destinationContainer.setBackgroundColor(color);
        
        return listItemView;
    }
}
