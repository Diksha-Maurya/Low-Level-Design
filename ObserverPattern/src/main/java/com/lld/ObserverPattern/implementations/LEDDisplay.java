package com.lld.ObserverPattern.implementations;

import com.lld.ObserverPattern.Interface.Observer;

public class LEDDisplay implements Observer {

    public void update(int temperature){
        System.out.println("LED Display: Temp is " + temperature + "°C");
    }
}
