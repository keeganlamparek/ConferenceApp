package com.example.keegan.conferenceapp;

/**
 * Created by Keegan on 9/21/2017.
 */

public class Schedule {

    private String day;
    private String timeBlock;
    private String eventName;


    public Schedule(String day ,String timeBlock, String eventName){
        this.day = day;
        this.timeBlock = timeBlock;
        this.eventName = eventName;
    }




    @Override
    public String toString() {
        return "This time block is scheduled from ";
    }
}
