package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);
		String path  = "";

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */
//		System.out.println("Enter the path of a file or Directory >>>");
//		String path = userInput.nextLine();
//		File f = new File(path);

		/*
		System.out.println("Let's create a new Directory!");
		System.out.println("Enter the path of the new directory");
		path  = userInput.nextLine();
		File newDirectory = new File(path);

		if(newDirectory.exists()){
			System.out.println( "Sorry " + newDirectory.getAbsolutePath() + " already exists");
			System.exit(1);

		}else {
			if (newDirectory.mkdir()){
				System.out.println("New directory created at " + newDirectory.getAbsolutePath());

			}else {
				System.out.println("Could not create directory");
				System.exit(1);
			}

		}
		*/

		System.out.println("Enter a name for the new file");
		String fileName = userInput.nextLine();
		File newFile = new File("test_directory", fileName);

		//create a catch base on what they enter
		try{
			newFile.createNewFile();
			System.out.println("File was created successfully");
		}catch (Exception ex){
			System.out.println(ex.getMessage());
			System.exit(1);
		}


		System.out.println("name: " + newFile.getName());
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		System.out.println("size : " + newFile.length());

		System.out.println("Enter some text for your new file");
		String message = userInput.nextLine();

		try (PrintWriter writer = new PrintWriter((newFile))){
			writer.println(message);
		}catch (Exception ex){
			System.out.println(ex.getMessage());

		System.out.println("size: " + newFile.length());
	}



}
