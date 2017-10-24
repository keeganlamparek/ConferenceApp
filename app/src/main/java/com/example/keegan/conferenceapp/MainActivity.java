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
import android.widget.TextView;

public class MainActivity extends Activity{

    private TextView list;
    private List<String> listOfDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildSchedules();
        list = findViewById(R.id.textList) ;
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.activity_main, R.id.textList, listOfDays);


    }

    private void  buildSchedules(){

        // Build Days
        GregorianCalendar day1 = new GregorianCalendar(2017, 10, 12);
        GregorianCalendar day2 = new GregorianCalendar(2017, 10, 13);

        // Build start/end time arguments for Timeblock class
        GregorianCalendar startTime1 = new GregorianCalendar(2017, 10, 12);
        GregorianCalendar startTime2 = new GregorianCalendar(2017, 10, 13);

        Schedule schedule1 = new Schedule(day1);
        Schedule schedule2 = new Schedule(day2);

        listOfDays = new ArrayList<String>();
        listOfDays.add(schedule1.toString());
        listOfDays.add(schedule2.toString());


    }

  //  @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        System.out.println();
        Intent i = new Intent(MainActivity.this, ScheduleActivity.class);
     //   i.putExtra("Date", )
        startActivity(i);

        }


    }

