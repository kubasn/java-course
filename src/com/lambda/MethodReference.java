package com.lambda;

import java.util.function.IntSupplier;

public class MethodReference {
    public static void main(String [] args){
        Object obj = new Object();
        //referencja to metody hashCode
        IntSupplier intSupplier = obj::hashCode;
        System.out.println(intSupplier.getAsInt());
    }
}
