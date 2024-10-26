package org.company.SumOfSquare;

public class SumOfSquares {

    public long calculateSumOfSquares(int n) {
        // write your code here
        if (n < 0) {
            return -1;
        }
        long sum = 0;
        for (int i = 0; i <= n; i++) {

            sum += i * i;


        }
        // System.out.println(sum);   //<- You can also put it here

        return sum;
    }


    public static void main (String[] args) {
        SumOfSquares test = new SumOfSquares();
        System.out.println(test.calculateSumOfSquares(3));
    }


}
