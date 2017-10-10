package com.example.keegan.conferenceapp;

/**
 * Created by matt on 9/27/2017.
 */

public class Event {

    private int sessionID;
    private String sessionDescription;
    private String sessionLongDescription;
    private String trackDescription;
    private String trackSecondDescription;
    private String[] presenters;
    private String buildingName;
    private int roomNumber;
    private String YearID;
    private String StatusDescription;
    private String sessionStatusNotes;

    public Event(int sessionID, String sessionDescription, String sessionLongDescription, String trackDescription, String trackSecondDescription, String[] presenters, String buildingName, int roomNumber, String yearID, String statusDescription, String sessionStatusNotes) {
        this.sessionID = sessionID;
        this.sessionDescription = sessionDescription;
        this.sessionLongDescription = sessionLongDescription;
        this.trackDescription = trackDescription;
        this.trackSecondDescription = trackSecondDescription;
        this.presenters = presenters;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.YearID = yearID;
        this.StatusDescription = statusDescription;
        this.sessionStatusNotes = sessionStatusNotes;
    }



}
