package com.techelevator;

public class Arrays {
    public static void main(String[] args) {

        double timGrade = 4;
        double johnGrade = 3;

        double[] temps = new double[10];
        temps[0] = 69.0;
        temps[1] = 70;
        int element2 = 2;
        temps[element2] = 80;

        System.out.println(temps[0]);
        temps = new double[4];
        System.out.println(temps[0]);

        System.out.println(temps.length);


        int x = 12;
        int y = x;
        x=5;
        System.out.println(x);      //5
        System.out.println(y);     //12

        int[] at = new int[2];
        int[] bt = at;
        at[0] = 6;
        System.out.println(at[0]);  //6
        System.out.println(bt[0]);  //6

    }
}
