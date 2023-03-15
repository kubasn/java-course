package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Pet {
    private String name;

    public Pet(String name){
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
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
        return this.name.equals(pet.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}


public class HashSetExample {
    public static void main(String [] args){

        HashSet<Pet> set = new HashSet<>();
        Pet a = new Pet("Dog");
        set.add(a);
        set.add(new Pet("Cat"));
        set.add(new Pet("Cat"));


        Iterator <Pet> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
