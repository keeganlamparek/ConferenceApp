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
    private String presenterOneName;
    private String presenterTwoName;
    private String presenterThreeName;
    private String presenterFourName;
    private String buildingName;
    private int roomNumber;
    private String YearID;
    private String blockDesc;
    private String blockStart;
    private String blockEnd;
    private String blockStartEng;
    private String blockEndEng;
    private String StatusDescription;
    private String sessionStatusNotes;

    public Event(int sessionID, String sessionDescription, String sessionLongDescription, String trackDescription, String trackSecondDescription, String presenterOneName, String presenterTwoName, String presenterThreeName, String presenterFourName, String buildingName, int roomNumber, String yearID, String blockDesc, String blockStart, String blockEnd, String blockStartEng, String blockEndEng, String statusDescription, String sessionStatusNotes) {
        this.sessionID = sessionID;
        this.sessionDescription = sessionDescription;
        this.sessionLongDescription = sessionLongDescription;
        this.trackDescription = trackDescription;
        this.trackSecondDescription = trackSecondDescription;
        this.presenterOneName = presenterOneName;
        this.presenterTwoName = presenterTwoName;
        this.presenterThreeName = presenterThreeName;
        this.presenterFourName = presenterFourName;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.YearID = yearID;
        this.blockDesc = blockDesc;
        this.blockStart = blockStart;
        this.blockEnd = blockEnd;
        this.blockStartEng = blockStartEng;
        this.blockEndEng = blockEndEng;
        this.StatusDescription = statusDescription;
        this.sessionStatusNotes = sessionStatusNotes;
    }

    public void setSessionDescription(String newDescription) {
        this.sessionDescription = newDescription;
    }
    
    public void setSessionLongDescription(String newLongDescription) {
        this.sessionLongDescription = newLongDescription;
    }
    
    public void setTrackDescription(String newTrackDescription) {
        this.trackDescription = newTrackDescription;
    }
    
    public void setTrackSecondDescription(String newTrackSecondDescription) {
        this.trackSecondDescription = newTrackSecondDescription;
    }

}
