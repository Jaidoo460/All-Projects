package com.techelevator;

import javax.print.attribute.standard.MediaSize;

public class Television {

    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn(){
        return isOn;
    }

    public int getCurrentChannel(){
        return this.currentChannel;
    }

    public int getCurrentVolume(){
        return this.currentVolume;
    }

    public void turnOff(){
        if(isOn) {
            isOn = false;
        }
    }

    public void turnOn(){
        if(!isOn){
            isOn = true;
        }
    }

    public void changeChannel(int newChannel){
        if(isOn()){
            this.currentChannel = newChannel;
        }
    }

    public void channelUp(){
        if(isOn()){
            this.currentChannel++;
        }if(this.currentChannel > 18) {
            this.currentChannel = 3;
        }
    }

    public void channelDown(){
        if(isOn()){
            this.currentChannel--;
        }if(this.currentChannel < 3) {
            this.currentChannel = 18;
        }
    }

    public void raiseVolume(){
        if(isOn()){
            this.currentVolume++;
        }
    }

    public void lowerVolume(){
        if(isOn()){
            this.currentVolume--;
        }if(this.currentVolume < 0) {
            this.currentVolume = 0;
        }
    }
}
