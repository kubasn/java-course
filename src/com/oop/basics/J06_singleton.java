package com.oop.basics;

class DBConnection{

    private static DBConnection instance;


    private DBConnection(){};


    public static DBConnection getInstance(){
        if(instance == null ){
            instance = new DBConnection();
        }

        return instance;

    }


}





public class J06_singleton {
    public static void main(String [] args){

        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();
        System.out.println(connection1 == connection2);

    }


}
