package com.lld.FactoryPattern.TypeOfNotification;

import com.lld.FactoryPattern.Interface.Notification;

public class SMSNotification implements Notification {
    public void send(String message){
        System.out.println("Sending message: " + message);
    }
}
