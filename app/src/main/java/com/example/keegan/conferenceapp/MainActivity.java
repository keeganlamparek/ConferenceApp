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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private TextView list;
    private List<String> listOfDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildSchedules();
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.list_item_layout, listOfDays);
        ListView listOfDays = (ListView) findViewById(R.id.daysListView);
        listOfDays.setAdapter(mAdapter);
        listOfDays.setOnItemClickListener(mMessageClickedHandler);


    }

    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            // Do something in response to the click
            Intent i = new Intent(MainActivity.this, ScheduleActivity.class);
            String passDay = "";

            passDay = listOfDays.get(position).toString();

            i.putExtra("day",passDay);

            startActivity(i);



        }
    };

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

/*  //  @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        Intent i = new Intent(MainActivity.this, ScheduleActivity.class);
        String passDay = "";

        passDay = listOfDays.get(position).toString();

        i.putExtra("day",passDay);

        startActivity(i);

        }*/


}

