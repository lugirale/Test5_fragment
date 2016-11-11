package com.example.homeone.test5_fragment;

import java.util.Calendar;
import java.util.UUID;


public class Gazpacho {

    private UUID mId;
    private Calendar mDate;


    public Gazpacho(Calendar date) {
        mDate = date;

    }

    public Calendar getDate() {
        return mDate;
    }

    public void setDate(Calendar date) {
        mDate = date;
    }

    public UUID getId() {
        return mId;
    }


}
