package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values");
		String userInput = scanner.nextLine();
		System.out.println(" ");

		String[] userValues = userInput.split(" ");
		int decimalValue = 0;
		String binary = "";

		for( int i = 0; i < userValues.length; i++){
			decimalValue = Integer.parseInt(userValues[i]);
			binary = Integer.toBinaryString(decimalValue);
			System.out.printf( "%d in binary is,%s, \n", decimalValue,binary );
		}




	}

}
