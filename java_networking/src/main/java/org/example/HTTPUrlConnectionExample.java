package org.example;

import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPUrlConnectionExample {
    public static void main(String [] args) throws Exception{
        URL url = new URL("http://imdb.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        System.out.println("Expired date: " + connection.getExpiration());
        System.out.println("Content-type:" + connection.getContentType());
        System.out.println("Content length:" + connection.getContentLength());
        System.out.println("Response code:" + connection.getResponseCode());
    }
}
