package com.collections;

import java.util.ArrayList;

public class ArrayListChallenge {

    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");

        System.out.println(names.get(0));
        names.set(2,"Olek");
        names.add(1,"Karol");
        names.remove(0);

        for (String i: names
             ) {
            System.out.println(i);
        }

    }
}
