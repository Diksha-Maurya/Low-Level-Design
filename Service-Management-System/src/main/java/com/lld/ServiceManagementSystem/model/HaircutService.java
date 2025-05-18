package com.lld.ServiceManagementSystem.model;

public class HaircutService extends BaseService{
    public HaircutService() {
        this.id = "haircut001";
        this.title = "Basic Haircut";
        this.price = 20.0;
    }

    @Override
    public String getDetails() {
        return "Haircut includes trimming and styling.";
    }
}
