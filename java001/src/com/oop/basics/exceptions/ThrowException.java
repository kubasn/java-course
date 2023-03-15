package com.oop.basics.exceptions;



class TestException extends Exception{
    public TestException(){
        super("test exception happened");
    }
    public TestException(String message){
        super(message);
    }

}







public class ThrowException {

    public int divide(int number,int divisor) throws ArithmeticException {
        return number/divisor;
    }

    public int test(int number) throws TestException {
        if(number == 1) throw new TestException();

        return 1;
    };





    public static void main(String args []){

        try{
            int numArray[]={0,1,2,3,4,5};
            int a = numArray[2];
            int divisor = numArray[0];
            if(divisor == 0) throw new ArithmeticException("Nie dziel przez zero!");

        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch(ArithmeticException e){
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("continue");



        ThrowException throwException = new ThrowException();

        try{
            throwException.divide(10,0);
        } catch(Exception e){
            e.printStackTrace();
        }


        try{
throwException.test(1);
        } catch(TestException e){
            e.printStackTrace();
        }


    }

}
