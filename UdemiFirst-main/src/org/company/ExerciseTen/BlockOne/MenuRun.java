package org.company.ExerciseTen.BlockOne;

public class MenuRun {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);
        boolean isPrime = number.isPrime();
        System.out.println("is Prime " + isPrime);

        int sum = number.sumUptoN();
        System.out.println(sum);

        int sum2 = number.sumOfDivisors();
        System.out.println(sum2);

        number.printTriangle();

        number.doWhile();

    }
}
