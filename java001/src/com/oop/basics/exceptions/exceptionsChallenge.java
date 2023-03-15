package com.oop.basics.exceptions;



public class exceptionsChallenge {

    public static void main(String[] args){

        int [] nums ={0,1,2,3,4,5};
        int number = 5;
        int divisionResult;
        try{
            divisionResult = number/nums[0];

        } catch(ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("block call out !");
        }


        try {
            if (number/nums[0] == 0) throw new TestException1();
        } catch ( TestException1 e) {
            e.printStackTrace();

        }



    }
}
