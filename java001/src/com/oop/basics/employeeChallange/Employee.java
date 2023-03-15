package com.oop.basics.employeeChallange;

public class Employee{
    String name;
    String surname;

    Employee(){
        name="unknown";
        surname="unknown";
    }
    Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    void printInfo(){
        System.out.println("name: " + name + "\nsurname: " + surname);
    }
}
