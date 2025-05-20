package com.lld.ObserverPattern;

import com.lld.ObserverPattern.implementations.LEDDisplay;
import com.lld.ObserverPattern.implementations.PhoneDisplay;
import com.lld.ObserverPattern.implementations.WeatherStation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverPatternApplication {

	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();

		PhoneDisplay phoneDisplay=new PhoneDisplay();
		LEDDisplay ledDisplay=new LEDDisplay();

		station.registerObserver(phoneDisplay);
		station.registerObserver(ledDisplay);

		station.setTemperature(30);
		station.setTemperature(34);

		SpringApplication.run(ObserverPatternApplication.class, args);
	}

}
