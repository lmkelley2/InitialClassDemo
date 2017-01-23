package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeapYearCalculatorTest {
    private LeapYearCalculator leapYear;

    @Before
    public void initialize() {
        leapYear = new LeapYearCalculator();
    }
    @Test
    public void test2004IsLeapYear() {
        boolean result = leapYear.isLeapYear(2004);
        Assert.assertTrue(result);
    }
}
