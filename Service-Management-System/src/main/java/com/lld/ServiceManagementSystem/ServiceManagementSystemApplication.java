package com.lld.ServiceManagementSystem;

import com.lld.ServiceManagementSystem.dto.ServiceResponse;
import com.lld.ServiceManagementSystem.factory.ServiceFactory;
import com.lld.ServiceManagementSystem.model.BaseService;
import com.lld.ServiceManagementSystem.model.Service;
import com.lld.ServiceManagementSystem.service.ServiceManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceManagementSystemApplication {

	public static void main(String[] args) {

		ServiceManager serviceManager = new ServiceManager();

		BaseService haircut = ServiceFactory.createService("haircut");
		serviceManager.registerService(haircut);
		ServiceResponse response = serviceManager.createService("haircut001", "user1");
		String msg = response.getMessage();
		System.out.println(msg);
		SpringApplication.run(ServiceManagementSystemApplication.class, args);
	}

}
