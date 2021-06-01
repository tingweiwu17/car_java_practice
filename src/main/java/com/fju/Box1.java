package com.fju;

public class Box1 extends Box{
    public Box1(){
        length = 5;
        height = 5;
        width = 5;
    }

    @Override
    public String getName(){
        return "Box1";
    }
    @Override
    public int getPrice(){
        return 30;
    }
}
