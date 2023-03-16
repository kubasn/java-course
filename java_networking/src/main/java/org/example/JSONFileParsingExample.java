package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JSONFileParsingExample {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader( new File("example.json")));

        StringBuffer buffer = new StringBuffer();
        String str;
        while( (str =bufferedReader.readLine()) != null){
            buffer.append(str);
        }

        String jsonStr = buffer.toString();
//        System.out.println(jsonStr);

        JSONObject jsonObject = new JSONObject(jsonStr);
        JSONObject company = jsonObject.getJSONObject("company");
        System.out.println(company.getString("name"));

        JSONArray arr = company.getJSONArray("products");
        for(int i=0;i< arr.length();i++){
            System.out.println("product: " + arr.getString(i));
        }

    }
}
