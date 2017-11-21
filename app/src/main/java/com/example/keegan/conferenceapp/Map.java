package com.example.keegan.conferenceapp;
/**
 * Created by Braeden Ingersoll on 9/21/2017.
 */

public class Map {

    private String roomName;
    private String buildingName;


    public Map(String roomName, String buildingName) {
        this.roomName = roomName;
        this.buildingName = buildingName;
    }

    public Class findMap() {

        Class mapAcitiviy = KentSecondFloorActivity.class;

    if (buildingName.equals("Kent"))
    {
        if (roomName.equals("Carse") || roomName.equals("Principal Black Box"))
        {
            mapAcitiviy = KentFirstFloorActivity.class;
        }
        if (roomName.equals("Hubbel") || roomName.equals("Student Senate"))
        {
            mapAcitiviy = KentSecondFloorActivity.class;
        }
    }

        return (mapAcitiviy);
    }
}