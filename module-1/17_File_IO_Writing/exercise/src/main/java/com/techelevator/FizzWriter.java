package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FizzWriter {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("The destination file: ");
		String destinationFile = userInput.nextLine();
		File fizzBuzz = new File(destinationFile);
		String output = "";
		final int limit = 301;
		int fizzBuzzNum =15;
		try (PrintWriter writer = new PrintWriter(fizzBuzz)){

			for (int i =1; i <limit; i++){
				if (i % fizzBuzzNum == 0){
					output = "FizzBuzz";
				}else if (i % 5 == 0){
					output = "Buzz";
				}else if (i % 3 == 0){
					output = "Fizz";

				}else{
					output = Integer.toString(i);
				}writer.println(output);
			}
		}catch (FileNotFoundException fnf){
			System.out.println("File was not found");
			System.exit(1);
		}
	}

}