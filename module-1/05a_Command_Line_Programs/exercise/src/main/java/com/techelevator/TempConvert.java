package com.techelevator;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class TempConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature");
		double temp = Double.parseDouble(scanner.nextLine());
		double convertTemp = 0;
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?\n");
		String typeTemp = scanner.nextLine();
		if (typeTemp.equalsIgnoreCase("f")){
			convertTemp = (temp - 32) / 1.8;
		}else if (typeTemp.equalsIgnoreCase("c")){
			convertTemp = ((temp * 1.8) + 32);
		}

		System.out.printf("Converted Temperature is %.0f ", convertTemp);



	}

}
