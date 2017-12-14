package com.example.keegan.conferenceapp;
import java.util.GregorianCalendar;

/**
 * Created by Keegan on 9/21/2017.
 */

public class Schedule {


    private GregorianCalendar day;

    public Schedule(GregorianCalendar day){
        this.day = day;
    }

    @Override
    public String toString() {
        String monthName = "";
        int monthNumber = day.get(GregorianCalendar.MONTH);

        switch (monthNumber){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }

        return monthName + " " + day.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
