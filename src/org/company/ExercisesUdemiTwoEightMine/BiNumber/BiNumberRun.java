package org.company.ExercisesUdemiTwoEightMine.BiNumber;

public class BiNumberRun {
    public static void main(String[] args) {
        int number1 = 48;
        int number2 = 18;

        int maxSan1;
        int maxSan2;

        BiNumber san = new BiNumber(48, 18);
        System.out.println(san.calculateGCD());
/*
        for (int i = 1; i <= number1; i++) {

            if (number1 % i == 0) {
                maxSan1 = number1 / i;

                System.out.print(maxSan1 + " ");
            }

        }

        System.out.println();

        for (int i = 1; i <= number2; i++) {

            if (number2 % i == 0) {
                maxSan2 = number2 / i;
                System.out.print(maxSan2 + " ");
            }

        }
*/
    }
}
