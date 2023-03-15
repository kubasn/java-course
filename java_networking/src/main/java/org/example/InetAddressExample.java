package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String [] args){
        System.out.println("hello!");

        try{
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host:" + ip.getHostName());
            System.out.println("ip:" + ip.getHostAddress());

            InetAddress addresses[] = InetAddress.getAllByName("www.google.com");

            for (int i=0;i<addresses.length;i++){
                System.out.println(addresses[i]);
            }

        } catch(UnknownHostException e){
            e.printStackTrace();
        }


    }
}
