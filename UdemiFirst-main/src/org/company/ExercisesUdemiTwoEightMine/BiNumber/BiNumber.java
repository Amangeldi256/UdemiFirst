package org.company.ExercisesUdemiTwoEightMine.BiNumber;

public class BiNumber {
    int number1;
    int number2;

    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    /*      method in udemi
        public int calculateLCM(){
         if (numBER1 < 0 || numBER2 < 0) {
            System.out.println(-1);
        }
        if (numBER1 == 0 || numBER2 == 0) {
            System.out.println(0);
        }


        int max = Math.max(number1, number2);
        int lcm = max; //8

        while(true) {
        boolean isFinalLcm = lcm%number1==0 && lcm%number2==0;
        if(isFinalLcm) {
        return lcm
        }
        lcm += max; //8+8+8
        }
        return -1;
        }

*/
    //Udemin Answer
    public int calculateGCD() {
        if(number1 == 0 && number2 == 0)  {
            return 0;
        }

        if(number1 < 0 || number2 < 0) {
            return 1;
        }

        int min = Math.min(number1, number2);

        for (int i = min; i > 0; i--) {
            boolean isDivisorOfBothNumber = number1 % i == 0 && number2 % i == 0;
            if(isDivisorOfBothNumber)  {
                return i;
            }
        }
        // Write your code here
        return -1;
    }


    //My answer
   /* public int calculateGCD() {
        int obsh = 0;

        for (int i = 0; i < number1; i++) {
            if (number1 % i == 0) {
                int san1 = number1 % i;
                System.out.print(san1);
            }
        }

        if(number1 % 2 == 0 && number2 % 2 == 0)  {

        }
        // Write your code here


        return obsh;
    }*/




















  /*  public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;

        if (num1 < 0 || num2 < 0) {
            System.out.println(-1);
        }
        if (num1 == 0 || num2 == 0) {
            System.out.println(0);
        }

        if(num1>num2) {
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }


    }*/
}
