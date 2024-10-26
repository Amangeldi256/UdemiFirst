package org.company.ArrayMassiv;

import java.util.ArrayList;
import java.util.List;
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
        int[] massivs = {1, 2, 3, 3, 5, 9, 15};
        int n = 6;

        int[] massOne = {5, 6};
        int[] massTwo = {3, 3, 5};
        //System.out.println(ArrayRunner.doesHaveElementGreatrtThan(massivs, n));
        System.out.println("finde Second El " + findSecondElement(massivs));
        System.out.println("twoMassibs  "  + calculateSum(massOne, massTwo));
        int[] massivSort = {1, 3, 4, 2};
        //System.out.println("SORT IS " + isSort(massivSort));
       // System.out.println("reverse " + reverseArray(massivs));

       ArrayList san = new ArrayList<Integer>();
       int divisor = 12;

       for (int i = 1; i < divisor; i++) {
        if(divisor % i == 0) {
            san.add(i);
        }
        
       }
       System.out.println("SAN " + san);
       int number = 3;
       int limit = 20;
       List<Integer> multiples = determineMultiples(number, limit);
        
       // Выводим результат
       System.out.println(multiples);
       
        }
      //  System.out.println(m);

      /*  public static boolean doesHaveElementGreatrtThan(int[] massivs, int number) {
        for(int ten : massivs) {
            if(ten == number) {
                return true;
            }
            
        }
        return false;
      }
    */
      public static int findSecondElement(int[] massivs) {
        int firstElement = Integer.MIN_VALUE;
        int secondElement = Integer.MIN_VALUE;
        
        if(massivs.length < 2) {
            return -1;
        }
    
        for(int element : massivs) {
         if(element > firstElement) {
            secondElement = firstElement;
            firstElement = element;
         }else if(element > secondElement && element != firstElement) {
            secondElement = element;
         }
        }
        if(secondElement == Integer.MIN_VALUE) {
            return -1;
        }
        return secondElement;
      }    
    
      public static boolean calculateSum(int[] massOne, int[] massTwo) {
        int sumOne = 0;
        int sumTwo = 0;
        for(int i = 0; i < massOne.length; i++) {
            sumOne += massOne[i];
        }
        System.out.println(sumOne);

        for (int j = 0; j < massTwo.length; j++) {
            sumTwo += massTwo[j];
        }
        System.out.println(sumTwo);
        
        if(sumOne != sumTwo) {
            return false;
        }

        return true;
      }
    
      public static boolean isSort(int[] massivSort) {
        for(int i = 0; i < massivSort.length - 1; i++) {
            if(massivSort[i] > massivSort[i + 1]) {
                return false;
            }
        }
        return true;
      }

      public static int[] reverseArray(int[] massivs) {
        
        int start = 0;
        int end = massivs.length - 1;
        int[] mass = new int[massivs.length];
        while(start <= end){
            mass[start] = massivs[end];
            mass[end] = massivs[start];
            start++;
            end--;
        }
        return mass;
      }

      public static List<Integer> determineMultiples(int number, int limit) {
        
        ArrayList deter = new ArrayList<Integer>();
        for (int i = 1; i <= limit; i++) {
            if(i % number == 0) {
                deter.add(i); 
            }
        }
            return deter;
        }
      }

