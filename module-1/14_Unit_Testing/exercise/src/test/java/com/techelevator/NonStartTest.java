package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void when_given_2strings_with_2orMore_letters(){
        NonStart nonStart = new NonStart();
        String firstWord = "Hello";
        String secondWord = "There";
        String expectedWord = "ellohere";
        String actual = nonStart.getPartialString(firstWord, secondWord);
        Assert.assertEquals("Does not return combined word without first letters of each", expectedWord, actual);
    }

    @Test
    public void when_given_2strings_one_only_1Letter(){
        NonStart nonStart = new NonStart();
        String firstWord = "I";
        String secondWord = "Hello";
        String expectedWord = "ello";
        String actual = nonStart.getPartialString(firstWord, secondWord);
        Assert.assertEquals("Does not return combined word without first letters of each", expectedWord, actual);
    }
}
