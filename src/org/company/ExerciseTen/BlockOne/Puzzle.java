package org.company.ExerciseTen.BlockOne;

public class Puzzle {
    public static void main(String[] args) {
        puzzle1();
        puzzle3();
        puzzle5();
    }

    private static void puzzle5() {
        int number = 5;
        if(number < 0)
            number = number + 10;
            number++;
        System.out.println(number);
    }

    private static void puzzle3() {
        int m = 15;

        if(m>20) {
            if (m < 20) {
                System.out.println("m>20");
            }else {
                System.out.println("who am i");
            }
        }else {
            System.out.println("m < 20");
        }
    }

    private static void puzzle1() {

        int k = 15;
        if(k > 20){
            System.out.println("k < 20");
        }else  if(k < 20) {
            System.out.println("k == 15");
        }else {
            System.out.println(false);
        }
    }


}
