package org.company.ExerciseTen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFirst {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "Hello World mAshina";

        File file = new File("");
        Scanner scanner = new Scanner(file);

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
