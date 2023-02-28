package com.oop.basics;

class Car {
    String model;
    String brand;
    String color;

    public Car(String model,String brand,String color){
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    String getColor(){
        return this.color;
    }
    void printInfo(){
        System.out.println("model: " + this.model + "\n"
        + "brand: " + this.brand + "\n"
        + "color: " + this.color + "\n"

        );
    }


}


class CarFactory {

    CarFactory(){}

    Car buildCar(){
        String color[] = {"red","black","white"};
        String chooseColor = color[(int)Math.floor(Math.random()*color.length)];


        Car car = new Car("Ford","Mustang",chooseColor);
    return car;
    }

}



public class J02_return_values_exercise {

    public static void main(String[] args){

        CarFactory carFactory = new CarFactory();
        Car car1 =  carFactory.buildCar();

        Car car2 = carFactory.buildCar();

        car1.printInfo();
        car2.printInfo();

    }


}
