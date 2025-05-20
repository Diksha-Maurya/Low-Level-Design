package com.lld.ObserverPattern.implementations;

import com.lld.ObserverPattern.Interface.Observer;

public class PhoneDisplay implements Observer {
    public void update(int temperature){
        System.out.println("Phone Display is " + temperature + "°C");
    }
}
