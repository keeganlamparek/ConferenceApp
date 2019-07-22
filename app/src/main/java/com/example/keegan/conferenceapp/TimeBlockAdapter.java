package com.example.keegan.conferenceapp;

/**
 * Created by Keegan on 12/6/2017.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class TimeBlockAdapter extends BaseAdapter{

    Activity context;
    String startTimes[];
    String endTimes[];
    List<TimeBlock> timeBlocks;

    public TimeBlockAdapter(Activity context, List<TimeBlock> timeBlocks) {
        super();
        this.context = context;
        this.timeBlocks = timeBlocks;
        startTimes = new String[timeBlocks.size()];
        endTimes = new String[timeBlocks.size()];

        for (int i = 0; i < timeBlocks.size(); i++){
            startTimes[i] = timeBlocks.get(i).startTimeToString();
            endTimes[i] =  timeBlocks.get(i).endTimeToString();
        }
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return timeBlocks.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    private class ViewHolder {
        TextView startTime;
        TextView endTime;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater inflater =  context.getLayoutInflater();


        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.list_two_items_layout, null);
            holder = new ViewHolder();
            holder.startTime = (TextView) convertView.findViewById(R.id.startTimeText);
            holder.endTime = (TextView) convertView.findViewById(R.id.endTimeText);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.startTime.setText(startTimes[position]);
        holder.endTime.setText(endTimes[position]);

        return convertView;
    }

}
