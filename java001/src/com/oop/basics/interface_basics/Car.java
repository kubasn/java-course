package com.oop.basics.interface_basics;

public class Car implements Vehicle{


    public void move(){
        System.out.println("car is moving");
    }

    @Override
    public void stop() {
        System.out.println("car is stopped");

    }

    @Override
    public void turn() {
        System.out.println("car is turning");
    }

    @Override
    public float getTopSpeed() {
        return 200;
    }
}
