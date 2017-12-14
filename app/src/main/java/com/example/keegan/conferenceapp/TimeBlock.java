package com.example.keegan.conferenceapp;
import java.util.GregorianCalendar;

/**
 * Created by Keegan on 10/5/2017.
 */

public class TimeBlock {


    private GregorianCalendar startTime;
    private GregorianCalendar endTime;
    private int timeBlockID;

    public TimeBlock(GregorianCalendar startTime, GregorianCalendar endTime, int timeBlockID) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeBlockID = timeBlockID;


    }


    public String startTimeToString(){

        String hourString = "";
        String minuteString = "";

        int hour = this.startTime.get(GregorianCalendar.HOUR_OF_DAY);
        int minute = this.startTime.get(GregorianCalendar.MINUTE);
        hourString = "" + hour;

        if (minute < 9){
            minuteString = "0" + minute;
        }
        else
            minuteString = "" + minute;

        return hourString + ":" + minuteString + " AM to";
    }

    public String endTimeToString(){

        String hourString = "";
        String minuteString = "";

        int hour = this.endTime.get(GregorianCalendar.HOUR_OF_DAY);
        int minute = this.endTime.get(GregorianCalendar.MINUTE);
        hourString = "" + hour;

        if (minute < 9){
            minuteString = "0" + minute;
        }
        else
            minuteString = "" + minute;

        return hourString + ":" + minuteString + " AM";
    }

    public int getTimeBlockID(){
        return this.timeBlockID;
    }


    public String toString(){
        return "This time block goes from: " + this.startTime.toString() + " to " + this.endTime.toString() + ".";
    }

}
