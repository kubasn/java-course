package com.stream;

import java.util.ArrayList;

public class ReduceValue {

    public static void main(String [] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 250, 300000, 4));
        cars.add(new Car("Mercedes", 270, 400000, 5));
        cars.add(new Car("Skoda", 190, 100000, 4));
        cars.add(new Car("Ford", 210, 150000, 3));
        cars.add(new Car("Fiat", 160, 110000, 2));

        int totalPrice = cars.stream().reduce(0,
                (subtotal,car)-> subtotal + car.price,Integer::sum);

        System.out.println(totalPrice);

    }
}
