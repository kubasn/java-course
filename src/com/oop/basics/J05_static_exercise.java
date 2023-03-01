package com.oop.basics;


class Item{
    public static int numItems = 0;
    final int ID;

    Item(int id){
        ID = id;
    }

    public static int getNextId(){
        return Item.numItems++;
    }
    public static Item getItem(){
        int id = Item.getNextId();
        Item item = new Item(id);
        return item;
    }

    public static void printNumItems(){
        System.out.println("numItems: " + Item.numItems);
    }

    public void printId(){
        System.out.println(this.ID);
    }

}







public class J05_static_exercise {

    public static void main(String [] args){

        for(int i=0;i<3;i++){
            Item item = Item.getItem();
            item.printId();
        }
        Item.printNumItems();
        System.out.println(Item.numItems);

    }


}
