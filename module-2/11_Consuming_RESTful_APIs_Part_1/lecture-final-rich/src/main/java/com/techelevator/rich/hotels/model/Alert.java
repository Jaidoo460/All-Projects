package com.techelevator.rich.hotels.model;

public class Alert {
    private String title;
    private AlertFeature[] features;


    public String getTitle() {
        return title;
    }

    public AlertFeature[] getFeatures(){
        return features;
    }


    @Override
    public String toString() {
        return "Alert{" +
                "title='" + title + '\'' +
                '}';
    }
}
