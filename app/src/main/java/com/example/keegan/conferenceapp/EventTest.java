// This file will take in information from the database and create all event objects from it.



package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;

import java.util.List;

public class EventTest extends AppCompatActivity {

    ListView listView;

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

        Event testEvent1 = new Event(1, "Building Software", "This is a test for event", "This presentation will look into how to build software that will last.  When making software, always build with longeviy and ease of use in mind.  This presentation should make anyone's code last far longer than what it would originaly.  More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.", event1_track, event1_presenters, "Kent", "Hubbel", "2017", "Presenting", "Group presenting now");

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
        //final Class mapFloor = thisMap.findMap();
        Map eventMap = new Map(event_roomName.toString(), event_buildingName.toString());
        final int mapImgValue = eventMap.findMap();

        listView = (ListView) findViewById(R.id.eventListView);

        ArrayAdapter<String> mapsAdapter = new ArrayAdapter<String>(EventTest.this, android.R.layout.simple_list_item_1, (List<String>) event_roomName);
        listView.setAdapter(mapsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent toMapImgActivity = new Intent(EventTest.this, MapImgActivity.class);
                //toMapImgActivity.putExtra("mapNames", listView.getItemAtPosition(i).toString());
                toMapImgActivity.putExtra("mapImage", mapImgValue);
                startActivity(toMapImgActivity);


                // For testing sponsors page only
                final Button sponsorButton = (Button) findViewById(R.id.toSponsor);
                sponsorButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(EventTest.this, SponsorActivity.class);
                        startActivity(intent);
                    }
                });

            }
        });
    }
}