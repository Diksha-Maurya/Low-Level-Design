package com.lld.FactoryPattern.TypeOfNotification;

import com.lld.FactoryPattern.Interface.Notification;

public class EmailNotification implements Notification {
    public void send(String message){
        System.out.println("Sending Email: " + message);
    }
}
