package com.techelevator;

import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {


            Scanner userInput = new Scanner(System.in);
            System.out.println("What is the search word?");
            String searchedWord = userInput.nextLine();

            System.out.println("What is the replacement word?");
            String replacementWord = userInput.nextLine();

            System.out.println("What is source file?");
            String sourceFile = userInput.nextLine();

            System.out.println("What is destination file");
            String destinationFile = userInput.nextLine();

            try {
                Scanner input = new Scanner(searchedWord);
                PrintWriter output = new PrintWriter(replacementWord)
                while (userInput.hasNextLine()) {
                    String
                }
            }



    }
