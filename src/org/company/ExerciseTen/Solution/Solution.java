package org.company.ExerciseTen.Solution;

public class Solution {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        
        if(isPalindrome(str)) {
            System.out.println(str + "Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        // Convert String to char array
        char[] charArray = str.toCharArray();
        for(int i=0; i < str.length(); i++) {
            if(charArray[i] != charArray[(str.length()-1) - i]) {
                return false;
            }
        }
        return true;
    }
}
