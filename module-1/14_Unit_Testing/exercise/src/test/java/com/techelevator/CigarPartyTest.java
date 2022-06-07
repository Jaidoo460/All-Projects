package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test
    public void when_cigars_between_40and60_and_weekday(){
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = false;
        int cigars = 41;
        boolean actual = cigarParty.haveParty(cigars, isWeekend);
        Assert.assertTrue("Does not return true when cigars between 40 and 60 and not weekend", actual);
    }

    @Test
    public void when_notWeekend_and_cigars_notBetween_40and60(){
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = false;
        int cigars = 61;
        boolean actual = cigarParty.haveParty(cigars, isWeekend);
        Assert.assertTrue("Does not return false when cigars greater than 60 and not weekend", !actual);
    }

    @Test
    public void when_Weekend_and_cigars_greaterThan_60(){
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = true;
        int cigars = 61;
        boolean actual = cigarParty.haveParty(cigars, isWeekend);
        Assert.assertTrue("Does not return true when cigars greater than 60 and weekend", actual);
    }

    @Test
    public void when_weekday_and_cigars_lessThan_40(){
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = false;
        int cigars = 39;
        boolean actual = cigarParty.haveParty(cigars, isWeekend);
        Assert.assertTrue("Does not return false when cigars less than 40 and not weekend", !actual);
    }
}
