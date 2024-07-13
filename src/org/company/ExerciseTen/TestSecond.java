package org.company.ExerciseTen;

public class TestSecond {
    public static void main(String[] args) {
        char r = 15;
        System.out.println(r);

        char s = 30;
        System.out.println(s);
        char m = 60;
        System.out.println(m);
        char e = 85;
        System.out.println(e);

        int start = 65;
        int thend = 123;
        char[] letters = new char[thend];

        for (int i = 0; i <= thend; i++) {
            letters[i] = start;
        }
    }
}
