package com.oop.basics.employeeChallange;

public class Programmer extends Employee{
    String languages;

    Programmer(String name,String surname,String languages){
        this.name = name;
        this.surname = surname;
        this.languages=languages;
    }

    void printInfo(){
        System.out.println("name: " + name + "\nsurname: " + surname + "\nlanguages: " + languages);
    }


}
