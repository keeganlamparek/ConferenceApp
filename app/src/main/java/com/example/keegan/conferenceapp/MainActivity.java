package com.example.keegan.conferenceapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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





        GregorianCalendar day = new GregorianCalendar(2017, 10, 12);

        GregorianCalendar startTime1 = new GregorianCalendar(2017, 10, 12, 9, 0);
        GregorianCalendar endTime1 = new GregorianCalendar(2017, 10, 12, 10, 0);

        GregorianCalendar startTime2 = new GregorianCalendar(2017, 10, 12, 12, 0);
        GregorianCalendar endTime2 = new GregorianCalendar(2017, 10, 12, 13, 0);


        TimeBlock block1 = new TimeBlock(startTime1, endTime1, 4);
        TimeBlock block2 = new TimeBlock(startTime2, endTime2, 5);

        ArrayList<TimeBlock> timeBlocks = new ArrayList<TimeBlock>();
        timeBlocks.add(block1);


        Schedule newSchedule = new Schedule(timeBlocks, day);

        newSchedule.addTimeBlock(block2);





     //   setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textList, timeBlocks));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        startActivity(new Intent(MainActivity.this, ScheduleActivity.class));
    }
}
