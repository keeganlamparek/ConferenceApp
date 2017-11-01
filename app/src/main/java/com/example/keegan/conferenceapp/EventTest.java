// This file will take in information from the database and create all event objects from it.



package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class EventTest extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_test);

        String[] event1_track = new String[2];
        event1_track[0] = "Coding";
        event1_track[1] = "Presentation";

        String[] event1_presenters = new String[2];
        event1_presenters[0] = "Wallace";
        event1_presenters[1] = "Dan";

        Event testEvent1 = new Event(1, "Test event title", "This is a test for event", "This is a long test description for a text field.", event1_track, event1_presenters, "Kent", "Black Box", "2017", "Presenting", "Group presenting now");

        final TextView event_title = (TextView) findViewById(R.id.event_title);
        event_title.setText(testEvent1.get_event_title());

        final TextView session_long_description = (TextView) findViewById(R.id.event_long_description);
        session_long_description.setText(testEvent1.get_event_long_description());

        final TextView event_tracks = (TextView) findViewById(R.id.event_track_description);
        event_tracks.setText(testEvent1.get_event_tracks());

        final TextView event_presenters = (TextView) findViewById(R.id.presenters);
        event_presenters.setText(testEvent1.get_event_presenters());

        final TextView event_buildingName = (TextView) findViewById(R.id.event_buildingName);
        event_buildingName.setText(testEvent1.get_event_buildingName());

        final TextView event_roomName = (TextView) findViewById(R.id.event_roomName);
        event_roomName.setText(testEvent1.get_event_roomName());

    }
}
