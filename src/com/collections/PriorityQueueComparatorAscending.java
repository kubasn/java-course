package com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

//rosnąco
class AscendingComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer x, Integer y) {
if(x ==y) return 0;
    if(x > y)    return 1;
    else return -1;
    }
}

class DescendingComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer x, Integer y) {
        if(x ==y) return 0;
        if(x < y)    return 1;
        else return -1;
    }
}

public class PriorityQueueComparatorAscending {

    public static void main(String [] args){

        PriorityQueue<Integer> test = new PriorityQueue<>(new DescendingComparator());
        test.add(4);
        test.add(9);
        test.add(13);
        test.add(1);
        test.add(70);

        while(!test.isEmpty()){
            System.out.println(test.poll());
        }

    }
}
