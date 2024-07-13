package org.company.ExerciseTen.BlockOne;

public class RunnerMyChar {
    public static void main(String[] args) {
        MyChar myChar1 = new MyChar('A');
        MyChar myChar2 = new MyChar('6');
        System.out.println(myChar1.isVowel());

      //  myChar1.isConsonant();


        System.out.println(myChar1.isDigital());
        System.out.println(myChar1.isAlphabet()); // 'a' to 'z' or 'A' to 'Z'
      //  System.out.println(myChar2.isAlphabet()); // 'a' to 'z' or 'A' to 'Z'
        System.out.println(myChar1.isConsonant());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
