package com.example.keegan.conferenceapp;
/**
 * Created by Braeden Ingersoll on 9/21/2017.
 */

public class Map {

    private String roomName;
    private String buildingName;
    private int mapDrawableId;




    public Map(String roomName, String buildingName) {
        this.roomName = roomName;
        this.buildingName = buildingName;

    }

    //public Class findMap() {

    //Function to return the resource files for the proper map
    public int findMap(){

        //Class mapAcitiviy = MapImgActivity.class;
        int outputMapValue = 0;

    if (buildingName.equals("Kent"))
    {
        if (roomName.equals("Carse") || roomName.equals("Principal Black Box"))
        {
            int mapResource = R.drawable.kent_first_floor;
            //int mapResource = 0

            //mapAcitiviy = MapImgActivity.class;

            //outputMapValue = mapResource;

        }
        if (roomName.equals("Hubbel") || roomName.equals("Student Senate"))
        {
           int mapResource = R.drawable.kent_second_floor;
            //int mapResource = 1

           // mapAcitiviy = MapImgActivity.class;

           // outputMapValue = mapResource;

        }
    }

        //return (mapAcitiviy);

        return outputMapValue;
    }

}