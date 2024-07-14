package org.company.ExerciseTen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFirst {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File(str);

        // File file = new File("D:\\Udemi\\first\\01.txt");
        File file = new File("D:\\Udemi\\first\\02.txt");
        Scanner scanner = new Scanner(file);

        String str = scanner.nextLine();

        // Преобразование строки в массив символов
        char[] charArray = str.toCharArray();
        int count=1;
        char c[] = {
                'a', 'b', 'c', 'd',
                'a', 'b', 'c', 'd',
                'a', 'b', 'c', 'd',
                'a', 'b', 'c', 'd',
                'a', 'b', 'c', 'd',
                'a', 'b', 'c', 'd'
        };

  //      int[] array = new int[charArray.length];
        // Вывод массива символов


            for (int i = 0; i < charArray.length; i++) {
                if(Character.isLetter(charArray[i]))
                System.out.println(" " + count + " " + charArray[i]);
                }
        System.out.println("");


        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 122) {
                System.out.println(" " + count + " " + charArray[i]);
                count++;
            }
        }
        System.out.println("");

            }
    }

