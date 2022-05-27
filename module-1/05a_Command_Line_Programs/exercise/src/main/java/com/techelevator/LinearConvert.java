package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		String f;
		String m;
		double feet;
		double meters;
		double convertFeet = 0.3048;
		double convertMeters = 3.2808399;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		int value = Integer.parseInt(input.nextLine());
		System.out.println("If measurement is in (m)eters or (f)eet.");
		String measurement = input.nextLine();
		if (measurement.equalsIgnoreCase("m")) {
			feet = value * convertMeters;
			System.out.println(value + "m " + "is " + feet + "f ");

		}else if (measurement.equalsIgnoreCase("f")){
			meters = value * convertFeet;
			System.out.println(value + "f " + "is " + meters + "m ");
		}

	}


}
