package com.oop.basics.interface_exercise;

public class Chrome implements Browser{
protected String url;

public void goToPage(String url){
    this.url = url;
    System.out.println("Chrome url" + url);
}

public void refreshPage(){

}

    public void bookmarkPage(){

    }

}
