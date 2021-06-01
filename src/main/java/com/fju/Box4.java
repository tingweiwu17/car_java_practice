package com.fju;

public class Box4 extends Box{
    public Box4(){
        length = 12;
        height = 10;
        width = 10;
    }

    @Override
    public String getName(){
        return "Box4";
    }
    @Override
    public int getPrice(){
        return 60;
    }
}
