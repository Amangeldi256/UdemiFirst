package org.company.ExerciseTen.StringMagic;

public class RunnerStringMagic {
    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
        System.out.println(uppercaseLetters); // This will print 5

        boolean hasConsecutiveDuplicates = stringMagic.hasConsecutiveDuplicates("Hello");
        System.out.println(hasConsecutiveDuplicates);

        int san = stringMagic.getRightmostDigit("I bought 5 apples, 4 bananas, and 3 oranges");
        System.out.println(san); // This will print 5

        

    }

}
