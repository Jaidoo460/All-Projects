package com.techelevator;

public class Elevator {
    int currentFloor;
    int numberOfFloors;
    boolean doorOpen;

    public Elevator(int numberOfLevels) {
        this.currentFloor = 1;
        this.numberOfFloors = numberOfLevels;

    }

    public int getCurrentFloor(){
        return this.currentFloor;

    }

    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }

    public boolean isDoorOpen(){
        return doorOpen;
    }

    public void openDoor(){
        if (this.doorOpen == false) {
            this.doorOpen = true;
        }
    }

    public void closeDoor(){
        if (this.doorOpen) {
            this.doorOpen = false;
        }
    }

    public void goUp(int desiredFloor){
        if(this.numberOfFloors >= desiredFloor && this.doorOpen == false && desiredFloor > this.currentFloor){
            this.currentFloor = desiredFloor;
        }
    }
}
