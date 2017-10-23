package com.example.keegan.conferenceapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        buildSchedules();


    }

    private void  buildSchedules(){

        // Build Days
        GregorianCalendar day1 = new GregorianCalendar(2017, 10, 12);
        GregorianCalendar day2 = new GregorianCalendar(2017, 10, 13);

        // Build start/end time arguments for Timeblock class
        GregorianCalendar startTime1 = new GregorianCalendar(2017, 10, 12, 9, 0);
        GregorianCalendar endTime1 = new GregorianCalendar(2017, 10, 12, 10, 0);
        GregorianCalendar startTime2 = new GregorianCalendar(2017, 10, 12, 12, 0);
        GregorianCalendar endTime2 = new GregorianCalendar(2017, 10, 12, 13, 0);
        GregorianCalendar startTime3 = new GregorianCalendar(2017, 10, 13, 12, 0);
        GregorianCalendar endTime3 = new GregorianCalendar(2017, 10, 13, 13, 0);
        GregorianCalendar startTime4 = new GregorianCalendar(2017, 10, 13, 14, 0);
        GregorianCalendar endTime4 = new GregorianCalendar(2017, 10, 13, 15, 0);

        // Build TimeBlocks
        TimeBlock block1 = new TimeBlock(startTime1, endTime1, 4);
        TimeBlock block2 = new TimeBlock(startTime2, endTime2, 5);
        TimeBlock block3 = new TimeBlock(startTime3, endTime3, 3);
        TimeBlock block4 = new TimeBlock(startTime4, endTime4, 6);

        // Build Array List for TimeBlocks to be used in Schedule
        ArrayList<TimeBlock> timeBlocks1 = new ArrayList<TimeBlock>();
        timeBlocks1.add(block1);
        Schedule schedule1 = new Schedule(timeBlocks1, day1);
        schedule1.addTimeBlock(block2);

        ArrayList<TimeBlock> timeBlocks2 = new ArrayList<TimeBlock>();
        timeBlocks2.add(block3);
        Schedule schedule2 = new Schedule(timeBlocks2, day2);
        schedule2.addTimeBlock(block4);
        List<String> listOfDays = new ArrayList<String>();
        listOfDays.add(schedule1.toString());
        listOfDays.add(schedule2.toString());
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textList, listOfDays));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch(position){
            case 0 :
                System.out.println();
                Intent i = new Intent(MainActivity.this, ScheduleActivity.class);

                startActivity(i);
                break;
            case 1 :
                System.out.println();
                break;

        }


    }
}
