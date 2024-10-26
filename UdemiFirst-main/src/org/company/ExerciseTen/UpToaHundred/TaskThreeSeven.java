package org.company.ExerciseTen.UpToaHundred;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TaskThreeSeven {
    public static void main(String[] args) throws IOException {
      /*  int f = 15;
        String m = "1526";
        System.out.println(f + m);

        System.out.println(f + m + 78);
        System.out.println((f + 20) + m + 78);

        int l = 100;
        System.out.printf("%d", l).println();*/

        Random rd = new Random();
        int a = rd.nextInt(200);
        int b = rd.nextInt(200);
        int c = rd.nextInt(200);
        int d = rd.nextInt(200);
        System.out.println(a + "=a; " + b + "=b; " + c + "=c; " + d + "=d;");

        if(a+b > c+d) {
            System.out.println("a + b  greate than" );
        }else {
            System.out.println("c + d Greate");
        }

        int method = 2;
        for (int i = 0; i < method; i++) {
            sayHello();
        }

     /*   FileWriter fileWriter = new FileWriter("file.txt");
        fileWriter.write("sayHello как подключить 1 \n");
        fileWriter.write("sayHello как подключить 2 \n");
        fileWriter.write("sayHello как подключить 3 \n");
        fileWriter.write("sayHello как подключить 4 \n");
        fileWriter.close();

        FileReader fileReader = new FileReader("file.txt");
        Scanner sc = new Scanner(fileReader);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        fileReader.close();*/


    }

    static void sayHello() {
        System.out.println("hi method Hello world");
        System.out.println("hi method first");
        System.out.println("hi method second");
        System.out.println("hi method three");
    }
}
