package com.udacity.gradle.builditbigger.backend;
/** The object model for the data we are sending through endpoints */
import  com.udacity.gradle.builditbigger.MyJoke;

public class MyBean {

    private String myData;
    private MyJoke myJoke;

    MyBean(){
        myJoke = new MyJoke();
    }

//    public String getJoke(){
//        return myJoke.getJoke();
//    }
    public String getJokes(){
        return  myJoke.getJoke();
    }

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}