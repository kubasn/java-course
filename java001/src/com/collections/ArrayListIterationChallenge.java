package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Product {
    protected String name;

    Product(){

    }

    Product(String name){
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
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}



public class ArrayListIterationChallenge {

    public static void main(String [] args){

        ArrayList<Product> products = new ArrayList<>();

        for(int i =0; i<10; i++){
            Product product = new Product("Product #" + i);
            products.add(product);
        }

        Iterator<Product> iterator = products.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
