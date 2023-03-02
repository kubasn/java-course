package com.oop.basics.private_exercise;

public class Product {
    private String name;

public Product(){
    this.name="unknown";
}

    public Product(String name){
        this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void SetName(String name){
    this.name =name;
    }


}
