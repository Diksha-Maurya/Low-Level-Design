package com.lld.ServiceManagementSystem.model;

public class AddOn {
    private String id;
    private String name;
    private double additionalCost;

    public AddOn(String id, String name, double additionalCost) {
        this.id = id;
        this.name = name;
        this.additionalCost = additionalCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(double additionalCost) {
        this.additionalCost = additionalCost;
    }
}
