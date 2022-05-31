package com.techelevator.coffeeshop;

import java.awt.*;
import java.security.PublicKey;

public class Mug {

    //What does it mean to be a mug
    // The properties are the adjectives or facts about our object

    /*-------------------*/
    /* STATIC MEMBERS/CONSTANT */
    /*-------------------*/

    public static final int DEFAULT_CAPACITY = 8;
    public static final int MAX_MUG_TEMPERATURE = 125;
    public static final double PRICE_PER_OUNCE = 0.50;

    public static int MUGS_IN_USE =0;

    /*-------------------*/
    /* PRIVATE PROPERTIES */
    /*-------------------*/

    private int capacityOunces;
    private boolean isInsulated;
    private String material;
    private Color color;
    private int temperature;

    /*-------------------*/
    /* PUBLIC PROPERTIES */
    /*-------------------*/

    public String decoration;
    public boolean hasLid;
    public int fillLevel;

    /*-------------------*/
    /* GETTERS & SETTERS */
    /*-------------------*/
    public Integer getCapacityOunces(){
        return this.capacityOunces;
    }

    public void setTemperature(int tempInF) {

        if(this.isInsulated){
            this.temperature = tempInF;
        }else{

            if(tempInF > MAX_MUG_TEMPERATURE){
                this.temperature = MAX_MUG_TEMPERATURE;
            }
        }
    }

    /*-------------------*/
    /* DERIVED PROPERTIES */
    /*-------------------*/

    public Double getPriceOfMug(){
        return this.capacityOunces * PRICE_PER_OUNCE;
    }

    /*-------------------*/
    /* CONSTRUCTORS (CTORs) */
    /*-------------------*/

    /* Default Constructor */
    public Mug(){
        Mug.MUGS_IN_USE++;
        this.color = Color.white;
        this.material = "paper";
        this.capacityOunces = DEFAULT_CAPACITY;
    }

    public Mug(int capacity, Color color, String material){
        Mug.MUGS_IN_USE++;
        this.capacityOunces = capacity;
        this.color = color;
        this.material = material;
    }

    //Actions a mug can perform or can be performed upon a mug

    private void coolOff(){}

    public void fill(){

        this.fillLevel = this.capacityOunces - 1;
    }

    public void fill(int ouncesToAdd) {
        this.fillLevel += ouncesToAdd;

        if(this.fillLevel >= this.capacityOunces - 1) {
            System.out.println("AHHHH! Ouch! I'ma Millionaire!");
            this.fillLevel = capacityOunces -1;
        }
    }

    public void emptyMug(){}
    public void sip(){}
    public int warm(){ return 0;}

    public String inspect(){
        String status = "";

        status += this.color + " " + this.capacityOunces + "oz mug : " + this.material + " contains" + this.fillLevel + " ounces";

        return status;
    }

}
