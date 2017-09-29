package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Schedule example = new Schedule("9/29/17", "1:00 PM", "1:50 PM", "event1");
        example.toString();
    }
}
