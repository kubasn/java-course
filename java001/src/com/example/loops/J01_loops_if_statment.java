package com.example.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J01_loops_if_statment {

    enum CarVariant {COMBI,SEDAN,CABRIO,SUV}


    public static void main(String [] args) throws IOException {
        int a = 8;

        if (a >= 7) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int b = a == 7 ? 3 : 99;
        System.out.println(b);


        boolean isEven = a % 2 == 0 ? true : false;
        System.out.println(isEven);


        int num =7;

      switch(num){
          case 1:
              System.out.println(1);
              break;
          case 3:
              System.out.println(3);
              break;
            case 7:
                System.out.println(7);
                break;


      }

    CarVariant car = CarVariant.SUV;


      switch(car){

          case COMBI:
              System.out.println(CarVariant.COMBI);
              break;
          case SUV:
              System.out.println(CarVariant.SUV);
              break;
              case CABRIO:
                  System.out.println(CarVariant.CABRIO);
                  break;
                  case SEDAN:
                      System.out.println(CarVariant.SEDAN);
                      break;
          default:
              System.out.println("default value");



      }

      int a1 =10;

      while(a1 > 0){
          System.out.println(a1);
          a1--;
      }

      a1 = 10;

      do{
          System.out.println(a1);
          a1--;
      } while(a1>0);


      BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in)
      );

      System.out.println("Wprowadź liczbę:");
      String input = reader.readLine();
      int inputVal = Integer.parseInt(input);

      int i=0;
      do{
          if (i % 2 == 0 && i != 0){
              System.out.println(i);
          }
          i++;
      } while(i<= inputVal);

 int numbers[] = {1,2,3,4,5,6,7,8,9,10};

for (int it: numbers){
    System.out.println(it);
}



    }
}
