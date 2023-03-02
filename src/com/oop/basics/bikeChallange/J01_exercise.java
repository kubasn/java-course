package com.oop.basics.bikeChallange;

public class J01_exercise {

    public static void main(String[] args) {
        Bike bike = new Bike("Honda", "300");
        bike.printInfo();
        MotorBike motorBike = new MotorBike("KTM", "450");

        motorBike.printInfo();


    }
}