package com.stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingInt {

    public static void main(String [] args){



        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",250,300000,4));
        cars.add(new Car("Mercedes",270,400000,5));
        cars.add(new Car("Skoda",190,100000,4));
        cars.add(new Car("Ford",210,150000,3));
        cars.add(new Car("Fiat",160,110000,2));

        int totalPrice = cars.stream().collect(Collectors.summingInt(car ->car.price));
        System.out.println(totalPrice);


        Map<String,Car> cars1 = cars.stream().collect(Collectors.toMap(car->car.name,car->car));
        System.out.println(cars1);

    }
}
