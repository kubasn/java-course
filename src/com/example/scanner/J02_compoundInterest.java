package com.example.scanner;

import java.util.Scanner;

public class J02_compoundInterest {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;
        double finalCapital;

        System.out.println("Wpisz kapitał początkowy: ");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie: ");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczedzania:");
        numYears = in.nextInt();

        finalCapital = startCapital*Math.pow(1+(yearlyInterest/100.0d),numYears);

        System.out.println("Efekt oszczędzania z procentem składanym: " + Math.round(finalCapital));

    }
}
