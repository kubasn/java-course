package com.example.scanner;

import java.util.Scanner;

public class J01_basic_scanner {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine();

        System.out.println("Twoje imie to: " + name);

    }


}
