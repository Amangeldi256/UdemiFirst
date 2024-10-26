package org.company.UdemiUrok.MotorBike;

public class MotorBike {

    //state

    private int speed; // member varieble
    //behavior
    //method
    //inputs - int speed
    //outputs - void
    //name - setSpeed
    MotorBike() {
        this(7); //maanisi jok , мааниси ушул жактан берлди
    }

    MotorBike(int speed) {
        this.speed = speed;
    }


    void  start() {
        System.out.println("Bike Started");
    }


    int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {  //Local variable
        this.speed = speed;
        if(speed > 0) // if биринчи systemoutprintln ге таандык
       // this.speed = speed;
        System.out.println("This bike" + this.speed);
        //System.out.println("Bike speed" + speed);

       // this.speed = speed;
    }

    public void increaseSpeed(int howMuch) {
        this.speed = this.speed + howMuch;
    }




}
