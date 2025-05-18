package com.lld.ServiceManagementSystem.model;

import com.lld.ServiceManagementSystem.enums.OrderStatus;

import java.time.LocalDateTime;

public class Order {
    private String userId;
    private LocalDateTime scheduledFor;
    private String companyId;
    private String serviceId;
    private OrderStatus status;
    private String paymentId;

    public Order() {
        // empty constructor
    }

    public Order(String userId, LocalDateTime scheduledFor, String companyId, String serviceId, OrderStatus status, String paymentId) {
        this.userId = userId;
        this.scheduledFor = scheduledFor;
        this.companyId = companyId;
        this.serviceId = serviceId;
        this.status = status;
        this.paymentId = paymentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getScheduledFor() {
        return scheduledFor;
    }

    public void setScheduledFor(LocalDateTime scheduledFor) {
        this.scheduledFor = scheduledFor;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
