package com.techelevator.coffeeshop;

import java.awt.*;

public class Mug {

    //What does it mean to be a mug
    // The properties are the adjectives or facts about our object
    private int capacityOunces;
    private boolean isInsulated;
    private String material;
    private Color color;
    private int temperature;

    public String decoration;
    public boolean hasLid;
    public int fillLevel;

    //String constructor
    /* String name = new String("Hello World"); */

    /* Default Constructor */
    public Mug(){
        this.color = Color.white;
        this.material = "paper";
        this.capacityOunces = 8;
    }

    public Mug(int capacity, Color color, String material){
        this.capacityOunces = capacity;
        this.color = color;
        this.material = material;
    }

    //Actions a mug can perform or can be performed upon a mug

    private void coolOff(){}

    public void fill(){}
    public void emptyMug(){}
    public void sip(){}
    public int warm(){ return 0;}

    public String inspect(){
        String status = "";

        status += this.color + " " + this.capacityOunces + "oz mug : " + this.material;

        return status;
    }

}
