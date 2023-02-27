package com.example.string;

public class J01_string {

    public static void main(String []args) {
        String str = "info ".repeat(3);
        String txt = String.join(".","Jeden","Dwa","Trzy");

        String arr[] = {"Marek","Darek","Witek"};
        String con = String.join(" ",arr);
        System.out.println(con);

    }
}
