package com.techelevator;

public class Item {
    private String name;
    private Double price;
    private String type;
//    private int capacity = 5;
//    private int itemCount = 5;

    //constructors
    public Item(String name, Double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    //methods

    //getters

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    //setters


    public void setType(String type) {
        this.type = type;
    }
}
