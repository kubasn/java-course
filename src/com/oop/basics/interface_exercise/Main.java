package com.oop.basics.interface_exercise;

public class Main {
    public static void main(String [] args){
        Browser chrome = new Chrome();
        Browser firefox = new Firefox();

        chrome.goToPage("www.wikipedia.com");
        firefox.goToPage("www.github.com");
    }
}
