package com.oop.basics.exceptions;

public class ExceptionsBasics {

    public static void main(String args []){

        try{
            int numArray[]={0,1,2,3,4,5};
            int a = numArray[2]/numArray[0];
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
    }

}
