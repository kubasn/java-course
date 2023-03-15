package com.example.data.types;

public class J07_var_Type {

    public static void main(String[] args){
        int number = addNumbers(5,"2");
        System.out.println(number);
    }

    public static int addNumbers(int num1,String b){
        var result = num1 + Integer.valueOf(b).intValue();
      return result;
    }
}
