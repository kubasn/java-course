package com.lambda;

import java.util.Arrays;

public class ArraySortLambda {
    public static void main(String[] args) {
        String arrStr[] = {"ford", "BMW", "Mercedes", "Dodge"};
        Arrays.sort(arrStr,(a,b)->a.length()-b.length());
        for (String s: arrStr
             ) {
            System.out.println(s);
        }

    }
}