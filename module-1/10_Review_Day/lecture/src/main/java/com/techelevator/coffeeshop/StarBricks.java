package com.techelevator.coffeeshop;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StarBricks {

    public static void main(String[] args) {

        //HOW MANY INSTANCES OF Mug
        System.out.println("Mugs in use: " + Mug.MUGS_IN_USE);

//        Boolean willMugHold12oz = Mug.DEFAULT_CAPACITY >=12;

        List<Mug> shopMugs = new ArrayList<>();

        Mug mug1 = new Mug();

        Mug mug2 = new Mug(12, Color.CYAN, "Ceramic");

        shopMugs.add(mug1);
        shopMugs.add(mug2);

        //NOW, HOW MANY INSTANCES OF Mug HAVE BEEN CREATED?
        System.out.println("Mugs in use: " + Mug.MUGS_IN_USE);

        reportMugsStatus(shopMugs);

        /*FILL THE SHOP MUGS*/
        for (Mug mug : shopMugs) {
            mug.fill();
        }

        reportMugsStatus(shopMugs);

        if( mug1.getCapacityOunces() > 8) {
            System.out.println("It's called a Grande");
        }else {
            System.out.println("It's a Venti");
        }
    }

    /*WHAT DID THIS ALL COST ME? */

    for (Mug mug : shopMugs){

    }

    public static void reportMugsStatus(List<Mug> shopMugs){

        for(Mug mug : shopMugs) {
            System.out.println(mug.inspect());
        }
    }

}
