package com.techelevator.hotels.model;

public class Alert {

    private String title;

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "title='" + title + '\'' +
                '}';
    }
