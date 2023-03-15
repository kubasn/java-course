package com.example.data.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J11_table {

    public static void main(String[] args) throws IOException {
        String  names[] = {"Ania", "Ola", "Daniel", "Karol","Kasia"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wprowadź index, maksymalna wartość: " + (names.length-1) );
        String val = reader.readLine();
        int index = Integer.parseInt(val);
        System.out.println(names[index]);



//tablica wielowymiarowa - tablica tablic

//String arr[][]= new String[2][3];

String arr[][] = {{"Marek","Darek","Witold"},{"Marek","Darek","Witold"}};
System.out.println(arr[0][2]);

    }

}
