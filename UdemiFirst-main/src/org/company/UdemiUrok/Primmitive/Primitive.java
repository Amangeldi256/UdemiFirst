package org.company.UdemiUrok.Primmitive;

import java.math.BigDecimal;

public class Primitive {
    public static void main(String[] args) {
     /*   int i = 010;
        System.out.println(i);

        int c = 0x010;
        int k = 011;
        System.out.println(c);
        System.out.println(k);
        */
        Binumber numbers = new Binumber(15, 30);
        System.out.println(numbers.add());
        System.out.println(numbers.multiplay());
        numbers.doubleValue();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());

        //BigDECIMAL    БОЮНЧА
        BigDecimal san1 = new BigDecimal(60.23659);
        BigDecimal san2 = new BigDecimal(110.987456);
        san1 = san1.add(san2);
        System.out.println(san1 + " " + san2);
       // int san3 = san1.add(san2); //add типа кошуу

    }
}
