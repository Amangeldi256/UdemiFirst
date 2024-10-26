package org.company.ExercisesUdemiTwoEightMine.Factorial;

public class Factorial {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        System.out.println(calculator.calculateFactorial(5));    // Output: 120
        System.out.println(calculator.calculateFactorial(4));    // Output: 24
        System.out.println(calculator.calculateFactorial(3));    // Output: 6
        System.out.println(calculator.calculateFactorial(2));    // Output: 2
        System.out.println(calculator.calculateFactorial(1));    // Output: 1
        System.out.println(calculator.calculateFactorial(0));    // Output: 1
        System.out.println(calculator.calculateFactorial(-5));   // Output: -1
    }
}
