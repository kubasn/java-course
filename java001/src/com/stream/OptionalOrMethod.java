package com.stream;

import java.util.Optional;

public class OptionalOrMethod {
    public static void main(String args){
        Integer integer = Integer.valueOf(20);
        Optional<Integer> optInt = Optional.ofNullable(integer);

        Integer int1 = optInt
                .filter(i->i>6)
                .filter(i-> i<100)
                .map(i->i*2)
                .filter(i -> i>1000)
                .or(()-> Optional.ofNullable(Integer.valueOf(20)))
                .orElse(Integer.valueOf(1200));

        System.out.println(int1);
    }
}
