package com.techelevator;

import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class FindAndReplace {

        public static void main(String[] args) {
                Scanner userInput = new Scanner(System.in);
                System.out.println("What is the search word?");
                String searchWord = userInput.nextLine();

                System.out.println("What is the replacement word?");
                String replacementWord = userInput.nextLine();

                System.out.println("What is the source file?");
                String path = userInput.nextLine();
                File file = new File(path);
                System.out.println("What is the destination file?");
                String destinationFile = userInput.nextLine();
                File convertedFile = new File(destinationFile);
                try (Scanner fileInput = new Scanner(file); PrintWriter writer = new PrintWriter(convertedFile)) {

                        while (fileInput.hasNextLine()) {

                                String lineOfText = fileInput.nextLine();


                                writer.println(lineOfText.replaceAll(searchWord, replacementWord));
                        }
                } catch (FileNotFoundException e) {

                        System.out.println("The file was not found: " + file.getAbsolutePath());
                }
        }
}
