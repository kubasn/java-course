package com.example.math;
import java.lang.*;

public class JO1_math {

    public static void main(String[] args){
        double d = 16.0d;
        double sqrt = Math.sqrt(d);
        System.out.println(sqrt);

        double power = Math.pow(d,2);
        System.out.println(power);


//        int i =3;
//        double a = 10.0d;
//        double b = a/i;
//        System.out.println(b);

        int i =3;
        double a = 10.0d;
        double b = (int) a/i;
        double num = 20.0d / (double) i;
        System.out.println(b);
        System.out.println(num);



        double w = 10.854;
        int j = (int) w;

        System.out.println(j);
        System.out.println(Math.round(w));

        System.out.println(Math.ceil(w));
        System.out.println(Math.floor(w));


        int val = 4;
        int newVal = 4 + val++;
        System.out.println(newVal);

        int val1 = 4;
        int newVal1 = 4 + ++val1;
        System.out.println(newVal1);



        int a1 =5;
        int b1 =3;
        a1 *= b1;
        System.out.println("Wynik: " + a1);




    }
}
