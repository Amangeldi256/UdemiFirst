package org.company.ExerciseTen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFirst {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            System.out.println("No file name provided!");
            return;
        }

        String str = args[0];
//
        File file = new File(str);
       // File file = new File("D:\\Udemi\\first\\01.txt");
        //File file = new File("Udemi\\first\\02.txt");
        Scanner scanner = new Scanner(file);

       // String str = scanner.nextLine();


        char[] letters = new char[52];
        int index = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            letters[index++] = ch;
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            letters[index++] = ch;
        }

        int[] counter = new int[52];

        for (char element : str.toCharArray()) {
            for (int i = 0; i < letters.length; i++) {
                if (element == letters[i]) {
                    counter[i]++;
                }
            }
        }

        for (int i = 0; i < letters.length; i++) {
            if (counter[i] > 0) {
                System.out.print(letters[i] + "" + counter[i] + "; ");
            }
        }
        System.out.println();
    }
}
