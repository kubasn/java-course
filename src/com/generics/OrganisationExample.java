package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

class Person{
    private String name;

    Person(String name){
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
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person{
private String jobTitle;
    public Employee(String name, String jobTitle){
        super(name);

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name" + this.getName() +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

class Organisation<T extends Person>{
private ArrayList<T> participants;

public Organisation(){
    participants = new ArrayList<T>();
}

public void addParticipant(T p){
participants.add(p);
}
public T getParticipant(int index){
    return participants.get(index);
}

public void printParticipants(){
    Iterator<T> iterator = participants.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
}

}

class Contractor extends Employee {
    public Contractor(String name, String jobTitle) {
        super(name, jobTitle);
    }

    @Override
    public String toString() {
        return "Contractor{ "+ super.toString() +"}";
    }
}


public class OrganisationExample {
    public static void main(String [] args){
Organisation<Employee> organisation = new Organisation<>();
organisation.addParticipant(new Employee("Kuba","mechanic"));
organisation.addParticipant(new Employee("Daniel","programista"));
organisation.addParticipant(new Contractor("Daniel","programista"));

organisation.printParticipants();

    }
}
