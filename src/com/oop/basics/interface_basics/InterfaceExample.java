package com.oop.basics.interface_basics;

public class InterfaceExample {

    public static void main(String [] args){
//Car car = new Car(); albo tak
Vehicle vehicle = new Car();
vehicle.move();

Vehicle car2 = new Car();
        car2.turn();
//mamy dzięki temu pełen dostęp do elementów klasy Car
        Car car3 = (Car) car2;



    }
}
