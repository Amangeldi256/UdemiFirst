package org.company.ExerciseTen.BlockOne;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch =ch;
    }

    public static void printLowerCaseAlphabets() {
        //'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
        
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch<= 'Z'; ch++) {
            System.out.println(ch);
        }
    }


    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;

        return false;
    }

    public boolean isDigital() {
        if(ch >= 48 && ch <=57) //between '0' and '9'
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if(ch >= 97 && ch <= 122) //between '0' and '9'
            return true;
        return false;
    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel()) //between '0' and '9'
            return true;
        return false;
    }


}
