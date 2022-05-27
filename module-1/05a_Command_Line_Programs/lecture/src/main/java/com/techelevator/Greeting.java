package com.techelevator;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {//entry point *void* (basically saying it wont return anything)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your name:");
//        String name = scanner.nextLine();
//        System.out.print("how old are you?");
//        int age = Integer.parseInt(scanner.nextLine());
//
//        String greeting = "Hi " + name;
//        System.out.println(greeting);
//        System.out.println("you are " + age);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scanner.nextLine();

        System.out.println("how old are you?");
        String ageAsString = scanner.nextLine();
        int age = Integer.parseInt(ageAsString);


        System.out.printf("Hi %s. you are %12s", name, age);


    }
}
