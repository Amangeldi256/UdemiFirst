package org.company.ExerciseTen.StringMagic;

public class StringMagic {
    int upperCase = 0;
//This is my example or solution
  /*  public int countUppercaseLetters(String b) {
        //TODO: Write your code here
         
        
        for (int k = 0; k < b.length(); k++) {
           if(Character.isUpperCase(b.charAt(k)))
           upperCase++; 
          // System.out.println(str.charAt(k));
        }
   
        System.out.println("Upparcae " + upperCase);
        return upperCase;
        */
        //This is Udemi
        public int countUppercaseLetters(String str) {
            if (str == null) 
                return -1;

                int count = 0;
            for (int i = 0; i < str.length(); i++) {
               // System.out.println(str.charAt(i));
               if(Character.isUpperCase(str.charAt(i))){
                count++;
               }
            }
            return count;
            
        }

        public boolean hasConsecutiveDuplicates (String str){
            //This is my
            /*int counter = 1;
            for (int i = 0; i < str.length(); i++) {
            char[] ch = str.toCharArray();
                if (ch.[i] == ch.[i+1]) {
                    return true;
                }else {
                    return false;
                }
            }
                */
            //This Udemi
            int[] counter = new int[126];
        
            for (int i = 0; i < str.length() - 1; i++) {
               if (str.charAt(i) == str.charAt(i+1)) {
                        return true;
               }
       
            }
            return false;

            /*anOTHER OPTION
            for(int i = 0; i < str.lenght()-1; i++){
            char currentCharacter = str.charAt(i);
             char nextCharacter = str.charAt(i+1);
             if(curr == next) {
             return true}
            }
             */
        }

        public int getRightmostDigit(String str) {
            
            int san = 0;
            // TODO: Write your code here

            for (int i = str.length() - 1; i >= 0; i--) {
              char c = str.charAt(i);
              if (Character.isDigit(c)) {
                // Возвращаем числовое значение цифры
                return Character.getNumericValue(c);
            }
        }
        // Если цифры не найдены, возвращаем -1 или любое другое значение, чтобы указать на отсутствие цифр
        return -1;
            
        }

        
    }



