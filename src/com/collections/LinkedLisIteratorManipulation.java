package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLisIteratorManipulation {

    public static void main(String [] args){

        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        list.addFirst("Rafał");
        list.addLast("Olek");

        ListIterator<String> iterator = list.listIterator();

while(iterator.hasNext()){
    String str = iterator.next();
    System.out.println(str);
    if(str.equalsIgnoreCase("Olek")){
        iterator.set("Ola");
    }
    if(str.equalsIgnoreCase("adam")){
        iterator.add("Darek");
    }
}

        Iterator<String> iterator1 = list.iterator();

while(iterator1.hasNext()){
    System.out.println(iterator1.next());
}


    }
}
