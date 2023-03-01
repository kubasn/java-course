package com.oop.basics.shop;

public class Computer extends Product{
public Mouse mouse;
public Monitor monitor;
public Keyboard keyboard;

Computer(){
     mouse = new Mouse();
     monitor = new Monitor();
     keyboard = new Keyboard();
};

}
