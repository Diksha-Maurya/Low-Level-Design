package com.lld.ServiceManagementSystem.dto;

public class ServiceResponse {
    String message;
    boolean success;

    public ServiceResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public String getMessage() { return message; }
    public boolean isSuccess() { return success; }
}
