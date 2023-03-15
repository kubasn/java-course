package com.oop.basics.bikeChallange;

public class MotorBike extends Bike {

    public MotorBike(String brand, String name){
        super(brand,name);
        this.SetType("MotorBike");
    }

    public void printInfo(){
        System.out.println("MotorBike");
        super.printInfo();
    }

}
