package org.company.ExerciseTen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestSecond {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Udemi\\first\\02.txt");
        Scanner scanner = new Scanner(file);
        String str = scanner.nextLine();
        // Преобразование строки в массив символов
        char[] charArray = str.toCharArray();
        int count=0;
        char[] array = new char[26];
        int index = 0;

            for (int i = 0; i < charArray.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        if(charArray[i] == c) {
                        array[index++] = c;
                        count++;
                        System.out.print(" " + count + " " + charArray[i]);
                }
            }

        }
        System.out.println();

        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < charArray.length; i++) {
                array[index] = c;
                if(charArray[i] == c)
                    count++;
                System.out.print(" " + count + " " + charArray[i]);

            }

            // System.out.print(c + " ");
        }
        System.out.println();



    }
}
