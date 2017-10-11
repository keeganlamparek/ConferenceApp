package com.example.keegan.conferenceapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        Calendar startTime1 = Calendar.getInstance();
        Calendar endTime1 = Calendar.getInstance();
        Calendar startTime2 = Calendar.getInstance();
        Calendar endTime2 = Calendar.getInstance();


        startTime1.set(Calendar.HOUR_OF_DAY, 11);
        endTime1.set(Calendar.HOUR_OF_DAY, 12);

        startTime2.set(Calendar.HOUR_OF_DAY, 13);
        endTime2.set(Calendar.HOUR_OF_DAY, 14);

        TimeBlock block1 = new TimeBlock(startTime1, endTime1, 4);
        TimeBlock block2 = new TimeBlock(startTime2, endTime2, 5);

        Schedule newSchedule = new Schedule();
        newSchedule.addTimeBlock(block1);
        newSchedule.addTimeBlock(block2);

        List<String> timeBlocks = new ArrayList<>();

        timeBlocks.add(newSchedule.getBlocks());




        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textList, daysList));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        startActivity(new Intent(MainActivity.this, ScheduleActivity.class));
    }
}
