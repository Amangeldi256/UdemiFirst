package org.company.UdemiUrok.String;

public class Biggser {
    public static void main(String[] args) {
        String biggerString = "This is a lot of text again";
       // biggerString.substring(5);
       System.out.println(biggerString.charAt(6));
       System.out.println(biggerString.substring(5));
       System.out.println(biggerString.substring(5, 13));
       for (int i = 0; i < biggerString.length(); i++) {
           System.out.print(biggerString.charAt(i) + " ");
       }
       System.out.println("");
    
       System.out.println(biggerString.indexOf("lot"));
       System.out.println(biggerString.indexOf('i'));
       System.out.println(biggerString.lastIndexOf('i'));
       System.out.println(biggerString.startsWith("This"));
       System.out.println(biggerString.endsWith("in"));

       String str1 = "Johny";
       System.out.println(str1.equals("Johny")); //true
       System.out.println(str1.equals("JOhny")); //false
       System.out.println(str1.equalsIgnoreCase("JOHny")); //true
       System.out.println(str1.toLowerCase());//johny
       System.out.println(str1.toUpperCase());//JOHNY

       String str2 = "    In 28 minutes is awesome.      ";
       System.out.println(str2.trim());
       System.out.println(String.join("-", "B", "C", "K", "D"));
       String str3 = "abcd";
       System.out.println(str3.replace("b", "LK"));
       System.out.println(str3.replace("ab", "OWR"));
       
    }
}
