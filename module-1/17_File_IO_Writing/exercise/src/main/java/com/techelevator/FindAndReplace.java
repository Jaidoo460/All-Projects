package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {

        private static final String BACON_FILE = "bacon.txt";
        private static final String INTO_BACON_FILE = "placeholder.txt";

    public static void main(String[] args) throws IOException {
            File file = new File(INTO_BACON_FILE);

            Scanner userInput = new Scanner(System.in);
            System.out.println("What is the search word?");
            String searchedWord = userInput.nextLine();

            System.out.println("What is the replacement word?");
            String replacementWord = userInput.nextLine();

            System.out.println("What is source file?");
            String sourceFile = userInput.nextLine();

            System.out.println("What is destination file");
            String destinationFile = userInput.nextLine();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    bw.write("jdfhskfhjkfhkj");

            } catch (IOException e) {
                    System.out.println("erooorrorororororororor");
            }


    }
    }
