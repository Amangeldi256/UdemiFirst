package org.company.ExercisesUdemiTwoEightMine.Factorial;

public class FactorialCalculator {

    private int number;

   /* public FactorialCalculator(int number) {
        this.number = number;
    }*/

    public int calculateFactorial(int number) {

        if (number < -1) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }


        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
}
