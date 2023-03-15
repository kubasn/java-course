package com.oop.basics.exceptions;

public class TestException1 extends Exception {

    TestException1(){
        super("exception occured");
    }

    TestException1(String message){
        super(message);
    }

}
