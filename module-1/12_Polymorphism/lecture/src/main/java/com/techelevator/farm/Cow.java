package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.PropertyResourceBundle;

public class Cow extends FarmAnimal implements Sellable{

	private BigDecimal price;

	public Cow() {

		super("Cow", "moo!");

		this.price = new BigDecimal( "1500.00");
	}

	public void milk(){
		System.out.println("Mm, Fresh Cow Juice!");
	}

	public BigDecimal getPrice(){
		return price;
	}

}