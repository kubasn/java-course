package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String args[] ) {


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(45);
        treeSet.add(4);
        treeSet.add(75);

        Iterator<Integer> integer = treeSet.iterator();
        while(integer.hasNext()){
            System.out.println(integer.next());
        }

        Iterator<Integer> descInteger = treeSet.descendingIterator();
        while(descInteger.hasNext()){
            System.out.println(descInteger.next());
        }
    }
}
