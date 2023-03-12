package com.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String [] args){

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(1);
        System.out.println(queue.peek());
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
