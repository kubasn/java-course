package com.lambda;

interface Addition{
    int add(int a, int b);
}

interface MathOperation <T>{
    T operate(T a, T b);
}

public class LambdaBasics {

    public static void main(String [] args){
        Addition addition = (int a,int b) -> a+b;
        System.out.println(addition.add(5,10));
        MathOperation<Integer> mathOperation = (a,b) -> a+b;
        System.out.println(mathOperation.operate(50,40));
        MathOperation<Float> mathOperation1 = (a,b) -> a*b;
        System.out.println(mathOperation1.operate(30.0f,5.2f));
    }
}
