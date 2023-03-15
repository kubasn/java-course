package com.example.string;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;

public class J03_chuck_example {

    public static void main(String[] args){

        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String line = null;
            while((line = reader.readLine()) != null ){
                System.out.println(line);
            }


        } catch(Exception e){
            e.printStackTrace();
        }




    }


}
