package org.company.ExercisesUdemiTwoEightMine.Digit;

public class Digit {
    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();

       /* System.out.println(utils.getLastDigit(1234));
        System.out.println(utils.getLastDigit(90));
        System.out.println(utils.getLastDigit(9));
        System.out.println(utils.getLastDigit(0));
        System.out.println(utils.getLastDigit(-1));*/

       /* System.out.println(utils.getNumberOfDigits(12345)); // Output: 5
        System.out.println(utils.getNumberOfDigits(90));    // Output: 2
        System.out.println(utils.getNumberOfDigits(9));     // Output: 1
        System.out.println(utils.getNumberOfDigits(0));     // Output: 1
        System.out.println(utils.getNumberOfDigits(-67));   // Output: -1
*/
      /*  System.out.println(utils.getSumOfDigits(123));   // Output: 6
        System.out.println(utils.getSumOfDigits(90));    // Output: 9
        System.out.println(utils.getSumOfDigits(5));     // Output: 5
        System.out.println(utils.getSumOfDigits(0));     // Output: 0
        System.out.println(utils.getSumOfDigits(-67));   // Output: -1

       */
        utils.reverseNumber(123); //should return 321.

        utils.reverseNumber(5497); //should return 7945.

        utils.reverseNumber(-456);
    }
}
