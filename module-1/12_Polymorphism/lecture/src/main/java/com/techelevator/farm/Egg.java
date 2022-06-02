package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable{

    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Egg() {
        name = "Grade A XLarge Egg";
        price = new BigDecimal( "0.25");
    }
}
