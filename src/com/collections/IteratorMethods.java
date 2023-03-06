package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {

    public static void main(String [] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Dodge");
        arr.add("Pontiac");
        arr.add("Mercedes");

        Iterator<String> iterator = arr.iterator();
        iterator.forEachRemaining(
                e -> System.out.println(e)
        );

//        albo prostszy  zapis
        arr.iterator().forEachRemaining(e -> System.out.println(e));


    }
}
