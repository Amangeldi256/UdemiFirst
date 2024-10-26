package org.company.ExerciseTen.BlockOne;

public class BlockOneRunner {
    public static void main(String[] args) {
        String word1 = new String("exaampla");
        String word2 = new String("exaampla");
        System.out.println(word1.equals(word2));

        // Преобразование строки в массив символов
        char[] charArray = word1.toCharArray();

        // Вывод массива символов
     /*   for (char c : charArray) {
            System.out.println(c);

        }*/

        StringBuilder word = new StringBuilder(word1);

        String str = "Hello World";


        int count=0;
        for (char element : str.toCharArray()){
            count++;

            System.out.print(count +" " + element + "  ");


        }
        System.out.println("");

        String[] strings = new String[] {word1};
        wordE(strings);
        //System.out.println(strings);

        //System.out.println(word);

        wordElement(charArray);


        for (int i = 0; i < charArray.length; i++) {
            word.append(charArray[i]);
        }

        System.out.println(word);

        

    }

    public static <T> void wordE(T[] list) {


        System.out.println(list[0]);
        System.out.println(list.length - 1);

    }


    public static void wordElement(char[] arrC) {
        for (int i = 0; i < arrC.length; i++) {
            System.out.println(arrC[i] + " " + i);

            //String[] strings2 = new String[] {arrC[]};
        }


    }

    public static void wordElementP(char[] arrC) {

        int firstElement = arrC[0];

        for (int i = 0; i < arrC.length; i++) {
            if(firstElement == arrC[i]) {
                firstElement = arrC[i];
            }

            System.out.println(arrC[i] + " " + i);
        }
    }

}
