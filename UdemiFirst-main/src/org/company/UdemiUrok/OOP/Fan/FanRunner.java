package org.company.UdemiUrok.OOP.Fan;

public class FanRunner {
    public static void main(String[] args) {
        System.out.println("Hello");
        Fan fan = new Fan("FanOne", 3.5655, "Red");
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte)5);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);

    }

}
