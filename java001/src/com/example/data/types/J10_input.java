package com.example.data.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J10_input {

    public static void main(String[] args) throws IOException {

  BufferedReader reader = new BufferedReader(
          new InputStreamReader(System.in)
  );

     System.out.println("Wprowadź imię");
     String name = reader.readLine();

     System.out.println("Wprowadź miejsce zamieszkania");
     String city = reader.readLine();

     String info = name + " mieszka w " + city;
     System.out.println(info + "\nilość znaków " + info.length());


    }
}