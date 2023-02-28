package com.oop.basics;


class Wallet{
float money;

public Wallet(){
    this.money = 0;
}
    public Wallet(float money){
        this.money = money;
    }
void addMoney(float amount){
        this.money += amount;
};

    void removeMoney(float amount){
        this.money -= amount;
    }

    void printAmount(){
        System.out.println(this.money);
    }



        }


public class J01_methods {


    public static void main(String[] args){

        Wallet wallet = new Wallet(3000);

        for(int i=0;i<6;i++)
        {
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }

        wallet.printAmount();

    }


}
