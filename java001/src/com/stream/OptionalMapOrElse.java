package com.stream;

import java.util.Optional;

public class OptionalMapOrElse {
public static void main(String args[]){

    Optional<Integer> opt = Optional.ofNullable(Integer.valueOf(0));

    Optional<Integer> opt2 = opt.map(i -> i*3);

    System.out.println(opt2.orElse(Integer.valueOf(12)));

    Integer int2 = new Integer(10);
    Optional<Integer> optInt = Optional.ofNullable(int2);

    optInt.map(i->i*2)
            .map(i->i+50)
            .map(i->i/2)
            .ifPresent(System.out::println);
}
}
