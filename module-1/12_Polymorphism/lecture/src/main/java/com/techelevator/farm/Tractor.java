package com.techelevator.farm;

public class Tractor implements SingAboutable {
    //PRIVATE MEMBERS
    private String name;
    private String sound;

    //GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public String getSound(){
        return this.sound;
    }

    //CONSTRUCTOR(s)
    public Tractor(){
        this.name = "Tractor";
        this.sound = "Vroom!";
    }

    public Tractor(String name, String sound){
        this.name = name;
        this.sound = sound;
    }
}
