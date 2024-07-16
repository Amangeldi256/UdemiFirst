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
        for (char c = 'a'; c <= 'z'; c++) {
                array[index++] = c;
                System.out.print(" " + c);

        }

            for (int i = 0; i < charArray.length; i++) {
                if(str.indexOf(i) == charArray[i]) {
                        if (charArray[i] == array[i]) {
                            array[index++] = array[i];
                            count++;
                            System.out.print(" " + count + " " + charArray[i]);
                        }

                }
        }
        System.out.println();





    }
}
