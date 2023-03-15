package com.generics;

import java.util.ArrayList;

class Util{
    public static <T> T getLastElement(ArrayList<T> list){
        return list.get(list.size()-1);
    }
}


public class GenericMethod {

    public static void main(String [] args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(8);
        int lastElem = Util.getLastElement(list);
        System.out.println(lastElem);

    }
}
