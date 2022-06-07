package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		System.out.print("Enter the path of a file or directory >>> ");
		String path = userInput.nextLine();
		File f = new File(path);

		/*
		 * The File class allows us to inspect various attributes of a file system object
		 */

		/* ***************************
		 * INSPECTING THE FILESYSTEM
		 * ***************************/

		System.out.println("Checking if file exists");
		if (f.exists()) { // returns true if a file or directory exists at the file system location, otherwise returns false
			System.out.println("name: " + f.getName());
			System.out.println("absolutePath: " + f.getAbsolutePath());
			if (f.isDirectory()) {
				System.out.println("type: directory");
			} else if (f.isFile()) {
				System.out.println("type: file");
			}
			System.out.println("size : " + f.length());
		} else {
			System.out.println(f.getAbsolutePath() + " does not exist.");
		}

		/*
		 * The File class also allows us to manipulate file system objects
		 * */

		/* ************************
		 * CREATING A DIRECTORY
		 * ************************/

		System.out.println();
		System.out.println("Let's create a new directory.");
		System.out.print("Enter the path of the new directory >>> ");
		path = userInput.nextLine();
		File newDirectory = new File(path);

		if (newDirectory.exists()) {
			System.out.println("Sorry, " + newDirectory.getAbsolutePath() + " already exists.");
			System.exit(1);
		} else {
			if (newDirectory.mkdir()) {
				System.out.println("New directory created at " + newDirectory.getAbsolutePath());
			} else {
				System.out.println("Could not create directory.");
				System.exit(1);
			}
		}

		/* ************************
		 * CREATING A FILE
		 * ************************/

		System.out.println();
		System.out.println("Now let's put a file in the directory.");
		System.out.print("Enter a name for the new file >>> ");
		String fileName = userInput.nextLine();
		File newFile = new File(newDirectory, fileName);

		newFile.createNewFile();
		System.out.println();
		System.out.println("name: " + newFile.getName());
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		System.out.println("size : " + newFile.length());

		/* ************************
		 * WRITING TO A FILE
		 * ************************/

		System.out.println();
		System.out.println("Now let's write something in the new file.");
		System.out.print("Enter a message to be stored in the new file >>> ");
		String message = userInput.nextLine();

		try (PrintWriter writer = new PrintWriter(newFile)) {
			writer.println(message);
		} // When we exit the try block, this cause the file to be closed and an automatic flush of the buffer to trigger

		System.out.println();
		System.out.println("name: " + newFile.getName());
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		System.out.println("size : " + newFile.length());

		/* ************************
		 * Appending Text in a file
		 * ************************/

		//Using our test_file: You can prompt for the file and path as per the above code
		String fileWriterPath = "test_file.txt";
		//You need a File  Object: the test file path is passed to the constructor
		File fileWriterFile = new File(fileWriterPath);
		//You need a File Writer Object: the File Object's absolute path passed to the constructor and a true/false parameter to indicate that you are appending
		FileWriter fileWriter = new FileWriter(fileWriterFile.getAbsolutePath(), true);
		//YOu need a BufferedWriter Object: This will handle all of the actions of writing from the buffer to the file
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		//Prompt for text from the ser
		System.out.print("Enter some text to append: ");
		String appendText = userInput.nextLine();
		//take the input and append to the file
		bufferedWriter.write(appendText);
		//Create a new line after or you will continue to append on the same line
		bufferedWriter.newLine();
		//Close up the buffer
		bufferedWriter.close();

	}

}
