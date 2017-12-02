// This file will take in information from the database and create all event objects from it.



package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Event testEvent1 = new Event(1, "Building Software", "This is a test for event", "This presentation will look into how to build software that will last.  When making software, always build with longeviy and ease of use in mind.  This presentation should make anyone's code last far longer than what it would originaly.  More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.", event1_track, event1_presenters, "Kent", "Principal Black Box", "2017", "Presenting", "Group presenting now");

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

        Map thisMap = new Map(testEvent1.get_event_roomName_for_map(), testEvent1.get_event_buildingName_for_map());
        final Class mapFloor = thisMap.findMap();

        final Button mapsButton = (Button) findViewById(R.id.toMap);
        mapsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(EventTest.this, mapFloor);
                startActivity(intent);
            }
        });

        // For testing sponsors page only
        final Button sponsorButton = (Button) findViewById(R.id.toSponsor);
        sponsorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(EventTest.this, SponsorActivity.class);
                startActivity(intent);
            }
        });

    }
}
