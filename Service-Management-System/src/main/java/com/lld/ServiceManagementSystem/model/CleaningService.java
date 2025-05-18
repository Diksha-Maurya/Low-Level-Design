package com.lld.ServiceManagementSystem.model;

public class CleaningService extends BaseService {
    public CleaningService() {
        this.id = "cleaning001";
        this.title = "Home Cleaning";
        this.price = 50.0;
    }

    @Override
    public String getDetails() {
        return "Cleaning includes kitchen, living room and bathrooms.";
    }
}
