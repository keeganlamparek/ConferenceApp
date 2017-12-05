package com.example.keegan.conferenceapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Braeden Ingersoll on 11/28/2017.
 */

/*public class CustomAdapter extends ArrayAdapter<String> {

    String[] mapName;
    int[] mapsResourceId;
    Context customContext;

    public CustomAdapter(@NonNull Context context, String[] inputMapNames, int[] inputMapsResourceId) {
        super(context, R.layout.listview_item_layout);

        this.mapName = inputMapNames;
        this.mapsResourceId = inputMapsResourceId;
        this.customContext = context;
    }

    @Override
    public int getCount() {

        return mapName.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mapsViewHolder = new ViewHolder();
        if(convertView == null) {

            LayoutInflater customLayoutInflater = (LayoutInflater) customContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = customLayoutInflater.inflate(R.layout.listview_item_layout, parent, false);
            mapsViewHolder.mapImage = (ImageView) convertView.findViewById(R.id.imageView);
            mapsViewHolder.mapText = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(mapsViewHolder);
        }

        else{
            mapsViewHolder = (ViewHolder) convertView.getTag();
        }

        mapsViewHolder.mapImage.setImageResource(mapsResourceId[position]);
        mapsViewHolder.mapText.setText(mapName[position]);

        return convertView;
    }

    static class ViewHolder{
        ImageView mapImage;
        TextView mapText;
    }*/

