package com.techelevator.hotels.model;

public class AlertFeatureProperties {

    private String messageType
    private String event;

    public String getEvent(){
        return event;
    }

    public void setEvent(String event){
        this.event = event;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "title='" + title + '\'' +
                '}';
    }
}
