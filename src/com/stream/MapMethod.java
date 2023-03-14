package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapMethod {

    public static void main(String [] args){

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",250,300000,4));
        cars.add(new Car("Mercedes",270,400000,5));
        cars.add(new Car("Skoda",190,100000,4));
        cars.add(new Car("Ford",210,150000,3));
        cars.add(new Car("Fiat",160,110000,2));

        List<Integer> carsPrices = cars.stream().map(Car::getPrice).collect(Collectors.toList());
        System.out.println(carsPrices);
    }
}
