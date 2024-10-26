package org.company.ExerciseTen.BlockOne;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int  sumUptoN() {
        int  sum = 0;
        for (int i = 0; i <= number ; i++) {
            sum += i;
        }
        return sum;
    }


    public int sumOfDivisors() {
        int sum = 0;
        for (int i = 2; i<= number - 1; i++){
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void printTriangle() {
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void doWhile() {
        int i = 1;
        do {
            System.out.println(i + " i ");
            i++;
        }while (i < 5);
        System.out.println(i + " j ");

    }
}
