package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateStream {
    public static void main(String args []){

       List<Integer> list = Stream.iterate(0, n->n<10, n->n+1).collect(Collectors.toList());
        System.out.println(list);
    }
}
