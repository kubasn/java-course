package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String [] args){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",250,300000,4));
        cars.add(new Car("Mercedes",270,400000,5));
        cars.add(new Car("Skoda",190,100000,4));
        cars.add(new Car("Ford",210,150000,3));
        cars.add(new Car("Fiat",160,110000,2));

        List <Car> list = cars.stream().filter(car -> car.price < 200000).collect(Collectors.toList());
        System.out.println(list);
        cars.stream().filter(car -> car.rating > 3)
                .forEach(car -> System.out.println(car));

        ArrayList<Car> carArrayList = new ArrayList<>(list);
        carArrayList.forEach(car -> System.out.println(car));
    }
}
