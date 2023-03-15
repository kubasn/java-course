package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    private String name,manufacturer;
    private int year;

    public Car(String name, String manufacturer, int year) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ArrayListIteration {

    public static void main(String args[]){


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Fiesta","Ford",2013));
        cars.add(new Car("Renault","Captur",2003));
        cars.add(new Car("Skoda","Citigo",2016));
        cars.add(new Car("BMW","X4",2023));

       Iterator<Car> iterator = cars.iterator();

       while(iterator.hasNext()){
           Car car = iterator.next();
           System.out.println(car);
       }

    }
}
