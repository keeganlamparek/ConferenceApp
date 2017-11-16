package com.example.keegan.conferenceapp;

/**
 * Created by matt on 9/27/2017.
 */

public class Event {

    private int sessionID;
    private String event_title;
    private String event_description;
    private String event_LongDescription;
    private String[] event_trackDescription;
    private String[] event_presenters;
    private String event_buildingName;
    private String event_roomName;
    private String yearID;
    private String event_statusDescription;
    private String event_statusNotes;

    public Event(int sessionID, String event_title, String event_description, String event_LongDescription, String[] event_trackDescription, String[] event_presenters, String event_buildingName, String event_roomName, String yearID, String event_statusDescription, String event_statusNotes) {
        this.event_title = event_title;
        this.sessionID = sessionID;
        this.event_description = event_description;
        this.event_LongDescription = event_LongDescription;
        this.event_trackDescription = event_trackDescription;
        this.event_presenters = event_presenters;
        this.event_buildingName = event_buildingName;
        this.event_roomName = event_roomName;
        this.yearID = yearID;
        this.event_statusDescription = event_statusDescription;
        this.event_statusNotes = event_statusNotes;
    }

    public String get_event_title() {
        return this.event_title;
    }

    public String get_event_long_description() {
        return this.event_LongDescription;
    }

    public String get_event_tracks() {
        String return_string = "";
        int num_track = 0;

        if (event_trackDescription.length >= 1) {
            return_string += event_trackDescription[0];
            num_track += 1;
        }
        else {
            return_string = "No special criteria";
        }

        while (num_track < event_trackDescription.length) {
            return_string += ", " + event_trackDescription[num_track];
            num_track += 1;
        }
        return return_string;
    }

    public String get_event_presenters() {
        String return_string = "";
        int num_presenters = 0;

        if (event_presenters.length >= 1) {
            return_string += event_presenters[0];
            num_presenters += 1;
        }
        else {
            return_string = "No presenters";
        }

        while (num_presenters < event_presenters.length) {
            return_string += ", " + event_presenters[num_presenters];
            num_presenters += 1;
        }
        return return_string;
    }

    public String get_event_buildingName() {
        return this.event_buildingName;
    }

    public String get_event_roomName() {
        return this.event_roomName;
    }

    //will status and status notes need to be shown?  what about canceled presentation?  How will people know?


}
