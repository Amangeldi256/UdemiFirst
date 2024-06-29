package org.company.ArrayMassiv;

import java.util.Random;

public class ArrayRunner {
    public static void main(String[] args) {
        Random rd = new Random();

        int count = 0;
        int sum = 0;

        int max = 220;
        int min = 170;
        int[] array = new int[20];

        int m = rd.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt((max - min) + 1) + min;
            System.out.println(i + " = "+array[i]);
        }
        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            if(180 <= array[i] && array[i] <= 200) {
                //System.out.println("max " + array[i]);
                count++;
            }
        }
        System.out.println(count);
        }
      //  System.out.println(m);
    }

