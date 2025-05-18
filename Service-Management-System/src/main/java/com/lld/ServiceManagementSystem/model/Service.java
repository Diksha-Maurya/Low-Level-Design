package com.lld.ServiceManagementSystem.model;

import java.util.List;
import java.util.Map;

public class Service {
    private String id;
    private String title;
    private String description;
    private double price;
    private int expectedHours;
    private List<AddOn> addOns;
    private List<Group> groups;
    private String imageUrl;
    private Map<String, String> metadata;

    public Service(){

    }

    public Service(String id, String title, String description, double price, int expectedHours, List<AddOn> addOns, List<Group> groups, String imageUrl, Map<String, String> metadata) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.expectedHours = expectedHours;
        this.addOns = addOns;
        this.groups = groups;
        this.imageUrl = imageUrl;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpectedHours() {
        return expectedHours;
    }

    public void setExpectedHours(int expectedHours) {
        this.expectedHours = expectedHours;
    }

    public List<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(List<AddOn> addOns) {
        this.addOns = addOns;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
