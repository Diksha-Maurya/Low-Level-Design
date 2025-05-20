package com.lld.ObserverPattern.implementations;

import com.lld.ObserverPattern.Interface.Observer;
import com.lld.ObserverPattern.Interface.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer o : observers){
            o.update(this.temperature);
        }
    }
}
