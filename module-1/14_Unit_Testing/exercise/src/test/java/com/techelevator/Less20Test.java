package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void when_given_nonNegative_number_3_less_than_multiple_of_20(){
        Less20 less20 = new Less20();
        int number = 107;
        boolean expectedResult = false;
        boolean actual = less20.isLessThanMultipleOf20(number);
        Assert.assertEquals("Does not return false when n 3 less than multiple of 20", expectedResult, actual);
    }

    @Test
    public void when_given_Negative_number(){
        Less20 less20 = new Less20();
        int number = -17;
        boolean expectedResult = false;
        boolean actual = less20.isLessThanMultipleOf20(number);
        Assert.assertEquals("Does not return false when number negative", expectedResult, actual);
    }

    @Test
    public void when_given_multiple_of20(){
        Less20 less20 = new Less20();
        int number = 158;
        boolean expectedResult = true;
        boolean actual = less20.isLessThanMultipleOf20(number);
        Assert.assertEquals("Does not return true when given 2 less multiple of 20", expectedResult, actual);
    }
}
