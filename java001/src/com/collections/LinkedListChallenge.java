package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();

        String exampleTab[] = {"dog", "cat", "tiger", "lion", "panda"};

        for (int i = 0; i < 20; i++) {
            String randElem = exampleTab[(int) Math.floor(Math.random()*4)];
            animals.add(new Animal((randElem)));
        };

        animals.removeFirst();
        animals.removeLast();

        ListIterator<Animal> iterator = animals.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(animals.size());
        animals.addFirst(new Animal("tiger"));
        animals.addLast(new Animal("lion"));

    }
}