package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetChallange {
    public static void main(String [] args){
        TreeSet <Integer> numbers = new TreeSet<>();

        for(int i=0;i<30;i++){
            numbers.add((int) Math.floor(Math.random()*100));
        }

        Iterator < Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
