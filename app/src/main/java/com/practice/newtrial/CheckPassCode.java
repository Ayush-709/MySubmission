package com.practice.newtrial;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckPassCode {
    public String getPass(){
        @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String todayDate = format.format(new Date());
        int d = Integer.parseInt(todayDate.substring(0,2));
        int m=Integer.parseInt(todayDate.substring(3,5));
        int y = Integer.parseInt(todayDate.substring(6,10));
        int pass = d*m*y;
        @SuppressLint("DefaultLocale") String passCode = String.format("%06d", pass);
        return passCode;
    }
}
