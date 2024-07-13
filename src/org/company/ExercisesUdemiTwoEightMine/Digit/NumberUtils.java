package org.company.ExercisesUdemiTwoEightMine.Digit;

public class NumberUtils {

    private int number;

   /* public NumberUtils(int number) {
        this.number = number;
    }*/

  /*  public int getLastDigit(int number) {
        // Write your code here

        int san;


        if (number < 0) {
            return -1;
        }

        if(number == 0) {
            return 0;
        }

        san = number % 10;
        return san;
    }
*/

    public int getNumberOfDigits(int number) {
        // Write your code here

        if (number < 0) {
            return -1;
        }

        if(number == 0) {
            return 0;
        }
        int san;
        int count = 0;

        while (number > 0) {
         number /= 10;
         count++;
        }
        return count;

    }


    public  int getSumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }

        if(number == 0) {
            return 0;
        }

        int san = 0;
        int count = 0;

        while (number > 0) {
           int digit = number % 10;
           san += digit;
           number /= 10;
        }
        return san;

    }
    //UDEMI ANSWER
    /*
    public int reverseNumber(int number) {
        if(number == 0) {
            return 0;
        }

        if (number < 0){
            return -1;
        }

        int reverse = 0;
        while (number>0) {
            int digit = number % 10;
            number = number/10;
            reverse = reverse*10 + digit;
            System.out.printf("digit - %d number - %d reverseNumber - %d" , digit , number, reverse).println();
        }

        return reverse;

    }
    */
    //My ANSWER
    public void reverseNumber(int number) {
        if (number < 0) {
            System.out.println(-1);
        }

        if(number == 0) {
            System.out.println(0);
        }
        int san = 0;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println();

    }
}
