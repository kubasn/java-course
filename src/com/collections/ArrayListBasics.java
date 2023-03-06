package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListBasics {
    public static void main (String args []){
        ArrayList basicsList = new ArrayList();
        basicsList.add("Ello");
        basicsList.add(new String("www"));

        String strEl = (String) basicsList.get(0);
        System.out.println(strEl);


        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Marek");
        arrStr.add("Darek");

        String el = arrStr.get(0);
        System.out.println(el);

        for (String i: arrStr
             ) {
            System.out.println(i);
        }

        Collections.sort(arrStr);
        for (String i: arrStr
             ) {
            System.out.println(i);
        }

    }
}
