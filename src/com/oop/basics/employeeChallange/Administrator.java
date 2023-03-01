package com.oop.basics.employeeChallange;

public class Administrator extends Employee{
    String certificates;

    Administrator(String name, String surname, String certificates){
        this.name = name;
        this.surname = surname;
        this.certificates = certificates;
    }

    void printInfo(){
        System.out.println("name: " + name + "\nsurname: " + surname + "\ncertificates: " + certificates);
    }


}
