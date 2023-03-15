package com.oop.basics.interface_extends;

public interface Flying {
    public default void fly(){
        System.out.println("Flying!");
    }
}
