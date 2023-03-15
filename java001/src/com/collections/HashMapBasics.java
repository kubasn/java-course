package com.collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee{
private String name;

    public Employee(String name) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}



public class HashMapBasics {

    public static void main (String [] args){
    HashMap<String,Employee> hashMap = new HashMap<>();
    hashMap.put("Adam",new Employee("Adam"));
    hashMap.put("Kasia",new Employee("Kasia"));
    hashMap.put("Eryk",new Employee("Eryk"));

    Employee e = hashMap.get("Adam");
    System.out.println(e);

    Iterator i = hashMap.entrySet().iterator();

    while(i.hasNext()){
        Map.Entry entry = (Map.Entry) i.next();
        System.out.println(entry.getKey() + " - " + entry.getValue());
    }

        for (Map.Entry<String,Employee> entry: hashMap.entrySet()
             ) {
            System.out.println(entry);
        }

    }
}
