package org.company.LeapYearChecker;

public class LeapYearChecker {

    public boolean isLeapYear(int year) {
        // Implement your code here
        if (year % 4 == 0) {
            if (year % 100 ==0) {
                if (year % 400 ==0) {
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        LeapYearChecker god = new LeapYearChecker();
        /*boolean result = year.isLeapYear{2000, 2100, 2000, };
        System.out.println(result);*/

        int[] years = { 2041, 2048, 2000, 2400, 2100, 2200, 2300};

        for (int year : years) {
            boolean result = god.isLeapYear(year);
            System.out.println(year + " is a leap year? " + result);
        }
    }

}
