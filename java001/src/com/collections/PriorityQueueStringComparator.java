package com.collections;


import java.util.Comparator;
import java.util.PriorityQueue;

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String x, String y) {
        return x.length() - y.length();
    }
}

public class PriorityQueueStringComparator {

    public static void main(String [] args){
        PriorityQueue<String> queue = new PriorityQueue<>(new StringComparator());
        queue.add("Bart");
        queue.add("Dariusz");
        queue.add("Marek");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

}
