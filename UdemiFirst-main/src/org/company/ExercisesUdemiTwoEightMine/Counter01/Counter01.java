package org.company.ExercisesUdemiTwoEightMine.Counter01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Counter01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter1 = new FileWriter("01.txt");
        fileWriter1.write("ABC");

        fileWriter1.close();

        FileReader fileReader1 = new FileReader("01.txt");
        Scanner sc1 = new Scanner(fileReader1);

        while (sc1.hasNextLine()) {
            System.out.println(sc1.nextLine());
        }

        fileReader1.close();

        FileWriter fileWriter2 = new FileWriter("02.txt");
        fileWriter2.write("Hello world");

        fileWriter2.close();

        FileReader fileReader2 = new FileReader("02.txt");
        Scanner sc2 = new Scanner(fileReader2);

        while (sc2.hasNextLine()) {
            System.out.println(sc2.nextLine());
        }

        fileReader2.close();
    }
}
