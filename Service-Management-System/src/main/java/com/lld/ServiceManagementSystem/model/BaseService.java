package com.lld.ServiceManagementSystem.model;

public abstract class BaseService {
    protected String id;
    protected String title;
    protected double price;


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getDetails();
}
