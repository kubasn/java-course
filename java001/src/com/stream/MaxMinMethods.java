package com.stream;

import java.util.ArrayList;

public class MaxMinMethods {
public static void main(String [] args) {
    ArrayList<Car> cars = new ArrayList<>();
    cars.add(new Car("BMW", 250, 300000, 4));
    cars.add(new Car("Mercedes", 270, 400000, 5));
    cars.add(new Car("Skoda", 190, 100000, 4));
    cars.add(new Car("Ford", 210, 150000, 3));
    cars.add(new Car("Fiat", 160, 110000, 2));

    Car carHighestPrice = cars.stream().max((car1,car2) -> car1.getPrice()> car2.getPrice() ? 1 : -1).get();

    Car carLowestPrice = cars.stream().min((car1,car2)->car1.getPrice()>car2.getPrice() ? 1: -1).get();

    System.out.println(carLowestPrice);
    System.out.println(carHighestPrice);
}
}
