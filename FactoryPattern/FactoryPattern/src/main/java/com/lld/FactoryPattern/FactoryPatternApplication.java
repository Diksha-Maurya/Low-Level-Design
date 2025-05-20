package com.lld.FactoryPattern;

import com.lld.FactoryPattern.Factory.NotificationFactory;
import com.lld.FactoryPattern.Interface.Notification;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {

	public static void main(String[] args) {

		Notification n = NotificationFactory.getNotification("email");

		n.send("This is awesome");

		SpringApplication.run(FactoryPatternApplication.class, args);
	}

}
