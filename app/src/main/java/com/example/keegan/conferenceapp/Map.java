package com.example.keegan.conferenceapp;
/**
 * Created by Braeden Ingersoll on 9/21/2017.
 */

public class Map {

    private String roomName;
    private String buildingName;


    public Map(String eventRoom, int roomNumber, String buildingName) {
        this.roomName = roomName;
        this.buildingName = buildingName;
    }

    public String findMap(String buildingName, String roomName) {
        String floorType = " ";

        if (buildingName.equals("Kent"))
        {
            if (roomName.equals("Hubbel") || roomName.equals("Student Senate"))
            {
                floorType = "Kent Second Floor";
            }
        }
        else
        {
            floorType = "Kent First Floor";
        }
     return floorType;
}
}

