package com.oop.basics.private_exercise;

public class Car  extends Product {
    public Car(){
        //        this.name ="car unknown"; to nie zadziała
//trzeba to zrobić przez konstruktor
        super("car unknown");
    }
}
