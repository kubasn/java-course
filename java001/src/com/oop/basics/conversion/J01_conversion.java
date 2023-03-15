package com.oop.basics.conversion;

class Employee {
    protected int salary;
    protected String name;

    public Employee(String name,int salary){
        this.salary = salary;
        this.name = name;
    }

    public void printName(){
        System.out.println("Employee:" + name + " salary:" + salary);
    }

}

class Manager extends Employee{
    public Manager(String name, int salary){
        super(name,salary );
    }
    public void printName(){
        System.out.println("Menager name:" + name);
    }
    public void giveRise(Employee e, float percent){
        e.salary += e.salary*percent;
    }
}





public class J01_conversion {


    public static void main(String [] args){
        Employee employees[] = new Employee[10];
        employees[0] = new Manager("Dyrektor",10000);
        employees[1] = new Employee("Programista",5000);
//error
//        employees[0].giveRise(employees[0],0.05f);
Manager menager = (Manager) employees[0];
menager.giveRise(employees[0],0.05f);

    }
}
