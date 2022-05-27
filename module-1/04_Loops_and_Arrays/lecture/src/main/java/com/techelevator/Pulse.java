package com.techelevator;

import java.awt.image.MultiPixelPackedSampleModel;

public class Pulse {

    public static void main(String [] args) {

        int age = 18;
        if (age >= 18) {
            System.out.println("adult");
            System.out.printf("can go to adult jail");
        }else if (age >= 13) {
            System.out.printf("teen");
            System.out.println("may go to adult jail");
        }else {
            System.out.printf("");
        }


    }

}
