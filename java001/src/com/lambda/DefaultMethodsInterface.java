package com.lambda;


//kompilator sprawdzi czy na pewno ten interfejs jest interfejsem funkcjonalnym
@FunctionalInterface
interface MathInterface {
    int operate(int a, int b);

        default int add(int a, int b){
            return a+b;
        }
        default int substract(int a,int b){
            return a-b;
        }
        default int multiply(int a, int b){
            return  a*b;
        }
        static int divide(int a, int b){
            return a/b;
        }



}

class MathClass implements MathInterface{
    @Override
    public int operate(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("multiply - Math Class");
        return a*b;
    }
}




public class DefaultMethodsInterface {
    public static void main(String args[]){
        //wyrażenie lambda które będzie w metodzie abstrakcyjnej operate
        MathInterface math = (int a, int b) -> a*b;
        System.out.println(math.operate(10,30));
        System.out.println(MathInterface.divide(100,4));
        System.out.println(math.add(40,5));

        MathClass mathClass = new MathClass();
        System.out.println(mathClass.operate(30,50));
    }
}
