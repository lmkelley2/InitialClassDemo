package edu.bsu.cs222;

public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        if (year >= 1752) {
            if (year % 100 == 0) {
                return (year % 400 == 0);
            }
            return year % 4 == 0;
        }
        else
            return false;
    }
}
