package com.techelevator;

import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int secretNumber = (int) (Math.random() * 100.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
//        for (int guessNumber = 0; guessNumber < 3;  guessNumber++) {
            System.out.println("Pick a number between 0 and 100");
            int guess = Integer.parseInt(scanner.nextLine());

            if (guess == secretNumber) {
                System.out.println("you are the most awesome guesser!!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("no! guess higher");
            } else if (guess > secretNumber) {
                System.out.println("no! guess lower");
            }
        }
    }
}
