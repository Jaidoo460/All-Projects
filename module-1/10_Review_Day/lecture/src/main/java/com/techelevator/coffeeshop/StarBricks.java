package com.techelevator.coffeeshop;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StarBricks {

    public static void main(String[] args) {

        List<Mug> shopMugs = new ArrayList<>();

        Mug mug1 = new Mug();

        Mug mug2 = new Mug(12, Color.CYAN, "Ceramic");

        shopMugs.add(mug1);
        shopMugs.add(mug2);

        for(Mug mug : shopMugs){
            System.out.println( mug.inspect() );
        }

    }

}
