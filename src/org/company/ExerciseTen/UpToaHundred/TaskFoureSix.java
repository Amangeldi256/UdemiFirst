package org.company.ExerciseTen.UpToaHundred;

public class TaskFoureSix {
    public static void main(String[] args) {
        //Тут два разного метода. Один из них метод и процедура
        int sum = sumOfThreeNumber(1, 15, 14);
        System.out.println("sum of tree numbers = " + sum);
        //процедура
        sumOfTwoNumber(15, 75);

        sumOfFoureNumber(10, 20, 30, 50);

        //надо искать разницу их(метеда и процедура)
    }

    public static int sumOfThreeNumber(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    static void sumOfTwoNumber(int s1, int s2) {
        int a = s1 + s2;
        System.out.println("SumOfTWOnUMBER = " + a);
    }

    static void sumOfFoureNumber(int f1, int f2, int f3, int f4) {
        int k = f1 +f2 +f3 +f4;
        System.out.println("sum of foure Numbers = " + k);
    }
}
