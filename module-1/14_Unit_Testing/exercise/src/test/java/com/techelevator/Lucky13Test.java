package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void when_given_array_with_no_1s_or_3s(){
        Lucky13 lucky13 = new Lucky13();
        int[] numbersArray = new int[]{0,2,4,5,33,11};
        boolean expectedResult = true;
        boolean actual = lucky13.getLucky(numbersArray);
        Assert.assertEquals("Does not return true when numbers Array does not contain 1 or 3", expectedResult, actual);
    }

    @Test
    public void when_given_array_with_1s_or_3s(){
        Lucky13 lucky13 = new Lucky13();
        int[] numbersArray = new int[]{0,2,1,5,33,11};
        boolean expectedResult = false;
        boolean actual = lucky13.getLucky(numbersArray);
        Assert.assertEquals("Does not return false when numbers Array contain 1", expectedResult, actual);
    }

    @Test
    public void when_given_array_with_3s_or_1s(){
        Lucky13 lucky13 = new Lucky13();
        int[] numbersArray = new int[]{0,2,5,33,3,5,6,11};
        boolean expectedResult = false;
        boolean actual = lucky13.getLucky(numbersArray);
        Assert.assertEquals("Does not return false when numbers Array contain 3", expectedResult, actual);
    }
}
