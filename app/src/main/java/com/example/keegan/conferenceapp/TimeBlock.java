package com.example.keegan.conferenceapp;



import java.sql.Time;
import java.util.Calendar;

/**
 * Created by Keegan on 10/5/2017.
 */

public class TimeBlock {


    private Calendar startTime;
    private Calendar endTime;
    private int maxEvents;

    public TimeBlock(Calendar startTime, Calendar endTime, int maxEvents) {
        this.maxEvents = maxEvents;
        this.startTime = startTime;
        this.endTime = endTime;

    }


    public String toString(){
        return "This time block is on " + "(NA)" + "and goes from: " + this.startTime.toString() + " to " + this.endTime.toString() + ".";
    }

}
