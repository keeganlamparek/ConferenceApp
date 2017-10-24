package com.example.keegan.conferenceapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.SharedPreferences;


public class MainActivity extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Schedule example = new Schedule("09/29/17", "1:00 PM", "1:50 PM");



        example.addDay("10/03/17");
        example.addDay("08/01/17");
        example.addStartTime("2:00 PM");
        example.addEndTime("3:50");


        List<String> daysList = example.getDays();


        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textList, daysList));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        startActivity(new Intent(MainActivity.this, ScheduleActivity.class));
        finish();
    }
}
