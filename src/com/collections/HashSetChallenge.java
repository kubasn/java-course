package com.collections;

import java.util.HashSet;
import java.util.Iterator;

class Car1{
    String name;

    public Car1(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class HashSetChallenge {

    public static void main(String args []){
        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Car1> car = new HashSet<>();
        car.add(new Car1("Dodge"));
        car.add(new Car1("Citroen"));
        car.add(new Car1("Opel"));

        Iterator<Car1> carIterator = car.iterator();
        while(carIterator.hasNext()){
            System.out.println(carIterator.next());
        }


    }
}
