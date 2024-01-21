package com.holidayzer.api.controllers;
public class Holiday {
    private String day;
    private String name;

    public Holiday(String day, String name){
        this.day = day;
        this.name = name;
    }

    public String getDay(){
        return this.day;
    }

    public String getName(){
        return this.name;
    }
}
