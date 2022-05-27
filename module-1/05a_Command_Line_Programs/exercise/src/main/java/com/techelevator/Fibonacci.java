package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int userNumber = Integer.parseInt(scanner.nextLine());
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber = firstNumber + secondNumber;
		if (userNumber <= 0) {
			System.out.println(firstNumber + ", "  + secondNumber );
		}else if ( userNumber == 1) {
			System.out.println(firstNumber + ", " + secondNumber + " " + thirdNumber);
		}else if (userNumber > 1){
			for(int i = 0; userNumber >= firstNumber; i++) {
				System.out.print(firstNumber + ", ");
                thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;

			}
		}

	}

}
