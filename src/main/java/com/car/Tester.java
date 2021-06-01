package com.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        int fee =30;
        Map<String ,Car> cars = new HashMap<>();
        Car c1 = new Car("qwe-123","07:30");
        Car c2 = new Car("asd-456","09:45");
        Car c3 = new Car("zxc-789","10:30");
        cars.put(c1.id,c1);
        cars.put(c2.id,c2);
        cars.put(c3.id,c3);
        String id = "asd-456";
        Car car = cars.get(id);
        if(car ==null){
            System.out.println("No car");
        }else{
            Date now = new Date();
            long ms = now.getTime()-car.enter.getTime();
            long mins = ms/(1000*60);
            System.out.println("mines"+mins);
            int times =(int) mins/60;
            int finalFee = fee*times;
            System.out.println("You have to pay "+finalFee);
        }



    }




}
