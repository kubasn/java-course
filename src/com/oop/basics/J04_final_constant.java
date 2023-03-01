package com.oop.basics;



class PointWithConstants{
int x,y;
final int width = 12;
final int height;


PointWithConstants(){
    height = 20;
}
PointWithConstants(int posX, int posY){
this();
x = posX;
y = posY;

}

public void changePosition(int newX,final int newY){
newX =30;
x = newX;
y = newY;
}


}










public class J04_final_constant {
    public static void main(String []args){

     PointWithConstants point = new PointWithConstants(33,44);
     point.changePosition(55,66);
     System.out.println("x: " + point.x + " y: " + point.y);

    }
}
