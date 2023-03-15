package com.oop.basics.abstractChallange;

abstract class Employee{
    protected String name;
    protected String surname;


    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public abstract String toString();


}


class Programmer extends Employee {
    protected String languages;

    public Programmer(String name, String surname, String languages){
        super(name,surname);
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String toString(){
        return "languages: " + languages + " name:" + name + " surname:" + surname;
    }
}



public class J01_main {

    public static void main(String [] args){
        Programmer programmer = new Programmer("Marek","Nowak","c++");
        System.out.println(programmer.toString());

    }

}
