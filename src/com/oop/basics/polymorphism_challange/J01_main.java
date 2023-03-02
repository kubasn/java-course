package com.oop.basics.polymorphism_challange;


class Flat {
    String city;
    String street;


    public Flat(){

    }

    public Flat(String city, String street){
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

class House extends Flat {
    float parcelSize;

    public House(String city, String street, float parcelSize){
        super(city,street);
        this.parcelSize = parcelSize;
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

class Residence extends House {
    float garageSize;
    public Residence(String city, String street,float parcelSize, float garageSize){
        super(city,street,parcelSize);
        this.garageSize = garageSize;
    }

    public float getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(float garageSize) {
        this.garageSize = garageSize;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "garageSize=" + garageSize +
                ", parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}



public class J01_main {


    public static void main(String [] args){
        Flat [] homes = new Flat[10];


    for(int i=0;i< homes.length;i++){
        int random = (int) Math.floor(Math.random()*3);
        if (random ==0){
            homes[i] = new Flat("Kraków","Wielicka");
        } else if(random == 1) {
            homes[i] = new House("Kraków","Mała Góra",50);
        }
        else if(random == 2){
            homes[i] = new Residence("Kraków","Duża Góra",20,5);
        }
    }


    for(int i=0;i< homes.length;i++){
        if(homes[i] instanceof Residence){
            Residence residence = (Residence) homes[i];
            System.out.println(residence.getGarageSize());
        } else if (homes[i] instanceof House){
            House house = (House) homes[i];
            System.out.println(house.getParcelSize());

        } else {
            homes[i].toString();
        }
    }



    }



}
