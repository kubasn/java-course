package com.depositCalc;

public class Main {

    public static void main(String[] args){
        float deposit = 1000.0f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;



    }

    public float interestRate(float deposit,float numDays,float interestRate,final float daysInYear){
        return deposit*numDays*interestRate/daysInYear;
    }
    public float tax(float interestRate, float tax){
        return tax*interestRate;
    }
    public float profit (float interestRate,float tax){
        return interestRate - tax;
    }

}
