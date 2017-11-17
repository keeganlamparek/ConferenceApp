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
        return day.get(GregorianCalendar.MONTH) + "/" + day.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
