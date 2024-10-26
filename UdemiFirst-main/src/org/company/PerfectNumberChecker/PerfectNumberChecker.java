package org.company.PerfectNumberChecker;

public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        // Write code here
        int sum=0;
        int i=1;
        while(i <= number/2)
        {
            if(number % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==number)
        {
            System.out.println("true");
            return true;


        } else{
            System.out.println(false);
            return false;
        }

    }

    public static void main(String[] args) {
        PerfectNumberChecker number = new PerfectNumberChecker();
        number.isPerfectNumber(6);
        number.isPerfectNumber(10);
        number.isPerfectNumber(18);
        number.isPerfectNumber(28);
        number.isPerfectNumber(30);
        number.isPerfectNumber(36);
        number.isPerfectNumber(48);
        number.isPerfectNumber(60);
        number.isPerfectNumber(90);
        number.isPerfectNumber(100);
    }
}

