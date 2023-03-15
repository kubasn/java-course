package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketWhoIsExample {
    public static void main(String [] args) throws Exception{
        Socket socket = new Socket("whois.internic.net",43);
        PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
        writer.println("google.com");

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        String line;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(line);
        }

    }
}
