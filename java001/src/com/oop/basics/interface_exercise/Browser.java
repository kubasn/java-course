package com.oop.basics.interface_exercise;

public interface Browser {
    static final String ENGINE = "WebKit";
    public static String getEngine(){
        return Browser.ENGINE;
    }

    public void goToPage(String url);

    public void refreshPage();

    public void bookmarkPage();



}
