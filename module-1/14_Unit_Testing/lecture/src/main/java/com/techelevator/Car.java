package com.techelevator;

//Demonstration Class for Testing purposes
public class Car {
    private int numberOfWheels =4; //Integer Property
    private String color ="Blue"; //String Property
    private int passengers[] = {1,2,3,4}; //Array Property

    public int getWheelCount(){
        //Return the number of wheels
        return this.numberOfWheels;
    }

    public void setColor(String color){
        //Set the color of the car
        this.color = color;
    }

    public String getColor(){
        //Return the Color of the Car
        return this.color;
    }

    public int[] getPassengers() {
        //Return the Array Property
        return this.passengers;
    }
}
