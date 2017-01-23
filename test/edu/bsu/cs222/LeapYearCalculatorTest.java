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
    @Test
    public void test2003IsNotLeapYear() {
        boolean result = leapYear.isLeapYear(2003);
        Assert.assertFalse(result);
    }
    @Test
    public void test1751IsNotLeapYear() {
        boolean result = leapYear.isLeapYear(1751);
        Assert.assertFalse(result);
    }
    @Test
    public void test1748IsNotLeapYear() {
        boolean result = leapYear.isLeapYear(1748);
        Assert.assertFalse(result);
    }
    @Test
    public void test1900IsNotLeapYear() {
        boolean result = leapYear.isLeapYear(1900);
        Assert.assertFalse(result);
    }
    @Test
    public void test2000IsLeapYear() {
        boolean result = leapYear.isLeapYear(2000);
        Assert.assertTrue(result);
    }
}
