package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class weird {

    //menu
    private static final String DISPLAY_MACHINE = "Display Vending Machine Items";
    private static final String PURCHASE_ITEMS = "Purchase";
    private static final String EXIT_MACHINE = "Exit";

    //interactive menu - list of strings
    public static void main(String[] args) {
        List<String> options = new ArrayList<String>();
        options.add(DISPLAY_MACHINE);
        options.add(PURCHASE_ITEMS);
        options.add(EXIT_MACHINE);

        Scanner inputScanner = new Scanner(System.in);
        String menuChoice = "";
        while(menuChoice != EXIT_MACHINE) {
            int menuIndex = 1;
            for (String option : options) {
                System.out.println(" (" + menuIndex + ") " + option);
                menuIndex++; //loop throw it and put a number. only does 3
            }
            System.out.println("Please select a number");
            try {
                int selectedOption = inputScanner.nextInt();
                menuChoice = options.get(selectedOption - 1);
                if(menuChoice == DISPLAY_MACHINE){

                }else if(menuChoice == PURCHASE_ITEMS) {

                }
                }catch(IndexOutOfBoundsException err){
                    System.out.println("Please make a valid selection");
                }

            }
        }

    }



