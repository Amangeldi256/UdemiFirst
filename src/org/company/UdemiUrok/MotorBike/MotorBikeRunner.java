package org.company.UdemiUrok.MotorBike;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike maanisJok = new MotorBike();
        MotorBike ducati = new MotorBike(450);
        MotorBike honda = new MotorBike(550);

        ducati.start();
        honda.start();

       // ducati.setSpeed(90);
       // System.out.println(ducati.getSpeed());

        //Большой пример:
        int ducatiSpeed = ducati.getSpeed();

        ducatiSpeed += 110;
        System.out.println("Большой пример" + ducatiSpeed);
        ducati.setSpeed(ducatiSpeed);


        ducati.increaseSpeed(250);
        System.out.println(ducati.getSpeed());
        System.out.println(maanisJok.getSpeed());// maanisi jok же контсруктор аркылуу берилди же алды.

        //  honda.setSpeed(26);
      //  System.out.println(honda.getSpeed());
    //    ducati.setSpeed(20);
    //    honda.setSpeed(10);


    }
}
