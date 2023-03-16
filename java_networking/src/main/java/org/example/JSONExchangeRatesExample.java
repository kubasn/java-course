package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONExchangeRatesExample {
    public static void main(String [] args) throws Exception{
        URL url = new URL("https://api.exchangeratesapi.io/latest?base=USD");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        if(connection.getResponseCode() != 200){
            System.out.println("Not 200 response, quit");
            return;
        }
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );

        String str;
        StringBuffer stringBuffer = new StringBuffer();

        while( (str = reader.readLine()) != null ){
            stringBuffer.append(str);

        }

        String jsonStr = stringBuffer.toString();
        System.out.println(jsonStr);
        reader.close();


    }
}
