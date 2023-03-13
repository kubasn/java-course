package com.generics;

class Square <T extends Number>{
    private T wall;

    Square(T wall){
        this.wall = wall;
    }
    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    public double getSeurfaceArea()
    {
        double value = wall.doubleValue();
        return value;
    }
}

public class SquareGenericChallenge {
    public static void main(String [] args){

        Square<Integer> square = new Square<>(10);
        System.out.println(square.getSeurfaceArea());
        Square<Float> square1 = new Square<>(5.7f);
        System.out.println(square1.getSeurfaceArea());
    }
}
