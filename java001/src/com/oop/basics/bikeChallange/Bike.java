package com.oop.basics.bikeChallange;

public class Bike  {
    public String brand;
    protected String name;
    private String type;


    public Bike(){};
    public Bike(String brand, String name){
        this.brand = brand;
        this.name = name;
        this.type = "Bike";
    }

    public void SetType(String type){
        this.type  = type;
    }

    public void printInfo(){
        System.out.println("brand:" + this.brand + "\nname" + this.name + "\ntype" + this.type);
    }


}
