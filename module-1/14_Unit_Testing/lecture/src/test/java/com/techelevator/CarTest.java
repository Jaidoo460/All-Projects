package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

    @Before
    public void startupTest(){
        System.out.println("Starting up the engine!");
    }

    @Test
    public void testWheels(){
        Car AnthonysCar = new Car();
        Assert.assertEquals(4, AnthonysCar.getWheelCount());
    }

    @Test
    public void testColor(){
        Car JensCar = new Car();
        JensCar.setColor("Orange");
        Assert.assertEquals(6, JensCar.getColor().length());
        Assert.assertEquals("Orange", JensCar.getColor());

        JensCar.setColor("Red");
        Assert.assertEquals("Red", JensCar.getColor());
    }

    @Test
    public void testPassengerCount(){
        Car LoganCar = new Car();
        int passengers[] = {1,2,3,4};
        Assert.assertArrayEquals(passengers,LoganCar.getPassengers());
    }
}
