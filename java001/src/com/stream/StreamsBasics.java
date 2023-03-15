package com.stream;

import java.util.ArrayList;

public class StreamsBasics {
    public static void main(String [] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Marek");
        arr.add("Darek");
        arr.add("Daniel");
        arr.add("Dawid");
        arr.add("Dorota");
        arr.add("Paweł");
        arr.add("Ola");

        arr.stream().filter(str->str.length() > 3 && str.length() <=5)
                .filter(str -> str.startsWith("D")).forEach(str-> System.out.println(str));


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",250,300000,4));
        cars.add(new Car("Mercedes",270,400000,5));
        cars.add(new Car("Skoda",190,100000,4));
        cars.add(new Car("Ford",210,150000,3));
        cars.add(new Car("Fiat",160,110000,2));

        cars.stream().filter(car -> car.rating > 3)
                .forEach(car -> System.out.println(car));

    }
}
