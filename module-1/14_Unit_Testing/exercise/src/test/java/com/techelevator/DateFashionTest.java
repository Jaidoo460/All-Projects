package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void One_date_8_and_above_and_other_2_orBelow(){
        DateFashion dateFashion = new DateFashion();
        int you = 8;
        int date = 1;
        int expectedResult = 0;
        int actual = dateFashion.getATable(you, date);
        Assert.assertEquals("Does not return 0 when you dress 8 or above and partner 2 or lower", expectedResult, actual);
    }

    @Test
    public void when_a_date_is_8_or_above_and_other_above_2(){
        DateFashion dateFashion = new DateFashion();
        int you = 3;
        int date = 8;
        int expectedResult = 2;
        int actual = dateFashion.getATable(you, date);
        Assert.assertEquals("Does not return 2 when you dress 8 or above and you dress above 2", expectedResult, actual);
    }

    @Test
    public void when_both_dates_below_8_and_above_2(){
        DateFashion dateFashion = new DateFashion();
        int you = 7;
        int date = 3;
        int expectedResult = 1;
        int actual = dateFashion.getATable(you, date);
        Assert.assertEquals("Does not return 1 when both date style between 2 and 8", expectedResult, actual);
    }
}
