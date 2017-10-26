package com.example.keegan.conferenceapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.GregorianCalendar;

public class ScheduleActivity extends AppCompatActivity {

    private TimeBlock timeBlock1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


        buildTimeBlock();
        String date = "";
        Bundle data = getIntent().getExtras();
        date = data.getString("day");
        TextView dateText = (TextView) findViewById(R.id.textView);
        TextView startView = (TextView) findViewById(R.id.startView);
        TextView endView = (TextView) findViewById(R.id.endView);
        dateText.setText(date);
        startView.setText(timeBlock1.startTimeToString());
        endView.setText(timeBlock1.endTimeToString());




    }

    private void buildTimeBlock(){


        GregorianCalendar startTime = new GregorianCalendar(2017, 10, 13, 9, 0);
        GregorianCalendar endTime = new GregorianCalendar(2017, 10, 13, 10, 0);
        timeBlock1 = new TimeBlock(startTime, endTime, 3);


    }

    public void switchToEvent(View view) {

        Intent i = new Intent(this, EventTest.class);
        startActivity(i);
    }
}
