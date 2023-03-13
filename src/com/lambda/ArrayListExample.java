package com.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("BMW");
        arr.add("Mercedes");
        arr.add(null);
        arr.add("Pontiac");
        arr.add(null);
        arr.removeIf(a -> a == null || a.equalsIgnoreCase("Pontiac"));
        System.out.println(arr);
    }
}
