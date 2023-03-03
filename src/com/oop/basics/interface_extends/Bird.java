package com.oop.basics.interface_extends;

public interface Bird extends Animal, Flying{
static final float DEFAULT_WINGSPAN = 0.7f;
default float getWingspan(){
    return Bird.DEFAULT_WINGSPAN;
}

}
