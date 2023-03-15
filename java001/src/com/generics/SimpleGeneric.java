package com.generics;

class Point<T>{
    private T x;
    private T y;

    public Point(T x, T y){
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}



public class SimpleGeneric {
    public static void main(String [] args){

        Point<Integer> point = new Point<>(5,4);
        System.out.println(point.toString());

        Point<String> point1 = new Point<>("x","y");
        System.out.println(point1.toString());

    }
}
