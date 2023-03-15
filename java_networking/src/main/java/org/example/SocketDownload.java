package org.example;

import java.io.*;
import java.net.Socket;

public class SocketDownload {
    public static void main (String [] args) throws Exception{
        Socket socket = new Socket("duckduckgo.com",80);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//bufferedWriter flush - wyslanie informacji do serwera
        bufferedWriter.write("GET / HTTP/1.0\n\n");
        bufferedWriter.flush();

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        String data;
        while((data = bufferReader.readLine()) != null ){
            System.out.println(data);
        }
    }
}
