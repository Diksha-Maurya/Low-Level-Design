package com.lld.ServiceManagementSystem.model;

import com.lld.ServiceManagementSystem.enums.PaymentStatus;

public class Payment {
    private String id;
    private double amount;
    private String method;
    private String userId;
    private String reason;
    private double discount;
    private PaymentStatus status;

    public Payment(String id, double amount, String method, String userId, String reason, double discount, PaymentStatus status) {
        this.id = id;
        this.amount = amount;
        this.method = method;
        this.userId = userId;
        this.reason = reason;
        this.discount = discount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
