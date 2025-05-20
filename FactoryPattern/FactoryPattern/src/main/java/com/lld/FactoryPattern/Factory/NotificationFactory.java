package com.lld.FactoryPattern.Factory;

import com.lld.FactoryPattern.Interface.Notification;
import com.lld.FactoryPattern.TypeOfNotification.EmailNotification;
import com.lld.FactoryPattern.TypeOfNotification.PushNotification;
import com.lld.FactoryPattern.TypeOfNotification.SMSNotification;

public class NotificationFactory {
    public static Notification getNotification(String type){
        if(type == null) return null;

        switch(type.toLowerCase()){
             case "email": return new EmailNotification();
             case "sms": return new SMSNotification();
             case "push": return new PushNotification();
             default: throw new IllegalArgumentException("Unknown type: " + type);
         }
    }
}
