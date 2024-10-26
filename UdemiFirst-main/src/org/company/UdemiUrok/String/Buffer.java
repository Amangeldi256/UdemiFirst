package org.company.UdemiUrok.String;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("TEST");
        
        System.out.println(sb.append( " 123"));


        System.out.println(sb);
        int u = 5;
        Integer integerOne = new Integer(6);
        Integer integerTwo = Integer.valueOf(8);
        System.out.println(integerOne);
        System.out.println(integerTwo);
        System.out.println(u);
        Integer integerThree = new Integer("547");
        System.out.println(integerThree);

        //LocalDateTime now = LocalDateTime.now();
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalDate yesterday = LocalDate.of(2019, 02, 05);
        System.out.println(yesterday);


    }

}
