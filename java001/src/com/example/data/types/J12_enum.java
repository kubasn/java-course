package com.example.data.types;

public class J12_enum {
    enum ShirtSize {S, M, L, XL};

    public static void main(String[] args) {

        ShirtSize buyerShirtSize = ShirtSize.S;
        buyerShirtSize = ShirtSize.M;

        System.out.println(buyerShirtSize);

    }
}
