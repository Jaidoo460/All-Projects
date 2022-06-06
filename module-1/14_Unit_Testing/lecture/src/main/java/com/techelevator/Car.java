package com.techelevator;

public class Car {
    private int numberOfWheels =4;
    private String color ="Blue";
    private int passengers[] ={1,2,3,4};

    //method num of wheel
    public int getWheelCount(){
        return this.numberOfWheels;
    }

    public void setColor(String Color){

    }


    //method that returns color
    public String getColor(){
        return this.color;
    }

    //method that return passenger
    public int[] getPassengers(){
        return this.passengers;
    }
}
