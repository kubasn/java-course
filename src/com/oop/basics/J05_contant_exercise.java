package com.oop.basics;

class Truck{
    String mark;
    String model;
    int wheelsNum;
    String color;
    final float TOP_SPEED = 100;
    final float ACCELERATION;


    Truck(){
        mark = "Freightliner";
        model = "9664";
        wheelsNum = 6;
        ACCELERATION = 60;
    }
    Truck(String color){
        this();
        this.color = color;
    }

    void printInfo(){
        System.out.println("mark: " + this.mark + "\ncolor: " + this.color);
    }


}








public class J05_contant_exercise {




 public static void main(String [] args){
    Truck truck = new Truck("red");
    truck.printInfo();
     Truck truck1 = new Truck("blue");
     truck1.printInfo();
     truck.printInfo();
 }


}
