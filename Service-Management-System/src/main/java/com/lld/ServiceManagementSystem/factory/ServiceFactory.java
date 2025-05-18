package com.lld.ServiceManagementSystem.factory;

import com.lld.ServiceManagementSystem.model.BaseService;
import com.lld.ServiceManagementSystem.model.CleaningService;
import com.lld.ServiceManagementSystem.model.HaircutService;

public class ServiceFactory {
    public static BaseService createService(String serviceType) {
        switch (serviceType.toLowerCase()) {
            case "haircut":
                return new HaircutService();
            case "cleaning":
                return new CleaningService();
            // Add more types as needed
            default:
                throw new IllegalArgumentException("Unknown service type: " + serviceType);
        }
    }
}
