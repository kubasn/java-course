package com.example.string;

public class J02_string_builder {

    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello word").append(" tekst 1");


        //insert val

        builder.insert(6," INSERTED ");


        System.out.println(builder);

//delete
        builder.delete(0,6);
        System.out.println(builder);



//cwiczenie
    String names[] = {"Marek","Kasia","Eryk"};
    StringBuilder builder1 = new StringBuilder();

    for (String el: names){
        builder1.append(el);
        builder1.append(" ");

    }

    System.out.println(builder1.toString());

    }
}
