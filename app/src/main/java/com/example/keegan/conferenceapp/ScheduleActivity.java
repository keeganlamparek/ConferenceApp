package com.example.keegan.conferenceapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.GregorianCalendar;

public class ScheduleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


        buildTimeBlock();
        String date = "";
        Bundle data = getIntent().getExtras();
        date = data.getString("day");
       // TextView dateText = (TextView) findViewById(R.id.dateText);
      //  dateText.setText(date);




    }

    private void buildTimeBlock(){


        GregorianCalendar startTime = new GregorianCalendar(2017, 10, 13, 9, 0);
        GregorianCalendar endTime = new GregorianCalendar(2017, 10, 13, 10, 0);
        TimeBlock timeBlock1 = new TimeBlock(startTime, endTime, 3);


    }
}
