package org.company;

public class MultiplicationTable {
   /* void print() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }*/

    void print() {
        print(7);
    }

    void print(int table) {
        print(table, 1, 10);
    }

    void prints(int table) {
        for (int i = 0; i < 10; i++) {
           System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }

    void print(int table, int from, int to) { //void printsa(int table, int from, int to) {  тоже есть один вариант
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
}
