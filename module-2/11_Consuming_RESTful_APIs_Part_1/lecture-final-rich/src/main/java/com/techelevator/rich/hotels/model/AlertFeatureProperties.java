package com.techelevator.rich.hotels.model;

public class AlertFeatureProperties {

    private String messageType;
    private String event;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "WEATHER ALERT: " +
                messageType + ": " + event;
    }
}
