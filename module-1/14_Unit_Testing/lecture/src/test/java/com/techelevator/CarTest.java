package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class CarTest {
    //Test Class: You must place tests in a class

    //Before Tag executes before every test method
    @Before
    public void startupTest(){
        System.out.println("Starting up the engine!");
    }

    //Test Tag indicates a test method follows
    @Test
    public void testWheels(){
        //This Method Tests the Number of Wheels Property
        Car AnthonysCar = new Car(); //Local Car Object
        //Test to ensure that it has 4 wheels
        Assert.assertEquals("This test ensures that the car has 4 wheels",4,AnthonysCar.getWheelCount());
    }

    //Test Tag indicates a test method follows
    @Test
    public void testColor(){
        //This Method Tests the Color Property
        Car JensCar = new Car();

        //Test that the set method works to change the color
        JensCar.setColor("Orange");
        //Tests against the color property
        Assert.assertEquals("This test ensures that the color has 6 characters", 6, JensCar.getColor().length());
        Assert.assertEquals("This test ensures that the color is Orange", "Orange", JensCar.getColor());
        //Set the color to Red
        JensCar.setColor("Red");
        Assert.assertEquals("This test ensures that the color is Red","Red", JensCar.getColor());
    }

    //Test Tag indicates a test method follows
    @Test
    public void testPassengerCount(){
        //This Method Tests passenger array property
        Car LoganCar = new Car();
        //Local Array Variable for comparison
        int passengers[] = {1,2,3,4};
        //Test that the passenger array property is the same as the local array
        Assert.assertArrayEquals("This test ensures that the passenger array is correct" ,passengers,LoganCar.getPassengers());
    }

}
