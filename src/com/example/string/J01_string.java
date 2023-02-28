package com.example.string;

public class J01_string {

    public static void main(String []args) {
        String str = "info ".repeat(3);
        String txt = String.join(".","Jeden","Dwa","Trzy");

        String arr[] = {"Marek","Darek","Witek"};
        String con = String.join(" ",arr);
        System.out.println(con);

        String empty = "";
        String blank = "\n   ";

        if(empty.isEmpty()){
            System.out.println("empty");
        };

        if(empty.isBlank()){
            System.out.println("blank");
        }


        String str1 = "Javascript programming";

        if(str1.startsWith("PHP")){
            System.out.println("starts with PHP");
        } else if (str1.startsWith("Java")){
            System.out.println("Starts with Java");
        }

        str1 = str1.replaceAll("Javascript","C++");
        System.out.println(str1);
        int index = str1.indexOf("C++",5);
        System.out.println("C++ zaczyna się od indeksu: " + index);

//        cwiczenie


        String text = "Ola ma kota ".repeat(3);
        System.out.println(text);
        text = text.replaceAll("Ola","Kasia");
        System.out.println(text);
        text = text.replaceFirst("Kasia","Monika");
        System.out.println(text);
        int indexFirst = text.indexOf("Kasia");
        System.out.println(indexFirst);
        int indexLast = text.lastIndexOf("Kasia");
        System.out.println(indexLast);
        System.out.println(text.substring(indexFirst));






    }
}
