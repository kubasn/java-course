package com.oop.basics;

class Roadster{
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;
    boolean crazyMode;

Roadster(float topSpeed, float acceleration){
    this.topSpeed = topSpeed;
    this.acceleration = acceleration;
}

Roadster(float topSpeed, float acceleration,float crazyTopSpeed,float crazyAcceleration){
    this.topSpeed = topSpeed;
    this.acceleration = acceleration;
    this.crazyTopSpeed = crazyTopSpeed;
    this.crazyAcceleration = crazyAcceleration;
}

float getTopSpeed() {return this.topSpeed;}

    float getAcceleration() {return this.acceleration;}

    float getTopSpeed(boolean crazyMode) {
    if(crazyMode) {
        return this.crazyTopSpeed;
    }
    else { return this.topSpeed;}
}

    float getAcceleration(boolean crazyMode) {
        if(crazyMode) {
            return this.crazyAcceleration;
        }
        else { return this.acceleration;}
    }




}





public class J03_overloading {


    public static void main(String [] args){

        Roadster car1 = new Roadster(120,1000,180,15000);
        System.out.println(car1.getAcceleration());
        System.out.println(car1.getTopSpeed());

        Roadster car2 = new Roadster(150,200);
        System.out.println(car1.getAcceleration(true));
        System.out.println(car1.getTopSpeed(true));




    }




}


