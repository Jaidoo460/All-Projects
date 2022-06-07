package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void when_given_word_is_3_or_greater(){
        FrontTimes frontTimes = new FrontTimes();
        String word = "Chocolate";
        String expectedString = "ChoChoCho";
        int times = 3;
        String actual = frontTimes.generateString(word, times);
        Assert.assertEquals("Does not return first 3 letters times the number given", expectedString, actual);

    }

    @Test
    public void when_given_word_less_than_3_letters(){
        FrontTimes frontTimes = new FrontTimes();
        String word = "Go";
        String expectedString = "GoGoGoGo";
        int times = 4;
        String actual = frontTimes.generateString(word, times);
        Assert.assertEquals("Does not return first given letters times the number given", expectedString, actual);

    }

    @Test
    public void when_given_0_for_times_repeated(){
        FrontTimes frontTimes = new FrontTimes();
        String word = "Chocolate";
        String expectedString = "";
        int times = 0;
        String actual = frontTimes.generateString(word, times);
        Assert.assertEquals("Does not return empty string given 0", expectedString, actual);

    }
}
