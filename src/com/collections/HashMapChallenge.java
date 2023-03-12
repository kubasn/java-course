package com.collections;

import java.util.HashMap;
import java.util.Map;

class AnimalEl{
    String name;

    public AnimalEl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalEl{" +
                "name='" + name + '\'' +
                '}';
    }

}


public class HashMapChallenge {

    public static void main(String [] args){

        HashMap<String,AnimalEl> map = new HashMap<>();
        String tab[] = {"Kot","Pies","Koza","Puma"};
        for(int i=0;i<tab.length;i++){
            map.put(tab[i],new AnimalEl(tab[i]));
        }

        System.out.println(map.get("Puma"));

     for(Map.Entry<String,AnimalEl> el : map.entrySet()){
         System.out.println(el.getKey() + "-" + el.getValue().name);

     }

    }
}
