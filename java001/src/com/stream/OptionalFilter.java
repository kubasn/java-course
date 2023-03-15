package com.stream;

import java.util.Optional;

public class OptionalFilter {

    public static void main(String [] args){
        Optional<String> opt = Optional.ofNullable("tekst tekst ");
        opt
                .map(s-> s.repeat(3))
                .filter(s-> s.length()<10)
                .or(() -> Optional.ofNullable("nowy string"))
                .ifPresent(System.out::println);

    }
}
