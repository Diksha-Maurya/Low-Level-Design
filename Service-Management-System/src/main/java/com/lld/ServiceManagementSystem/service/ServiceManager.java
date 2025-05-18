package com.lld.ServiceManagementSystem.service;

import com.lld.ServiceManagementSystem.dto.ServiceResponse;
import com.lld.ServiceManagementSystem.enums.OrderStatus;
import com.lld.ServiceManagementSystem.model.BaseService;
import com.lld.ServiceManagementSystem.model.Order;
import com.lld.ServiceManagementSystem.model.Service;
import org.hibernate.boot.model.relational.Database;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceManager {
    private Map<String, BaseService> serviceMap = new HashMap<>();
    private List<Order> orders = new ArrayList<>();

    public void registerService(BaseService service) {
        serviceMap.put(service.getId(), service);
    }

    public ServiceResponse createService(String serviceId, String userId) {
        if (!serviceMap.containsKey(serviceId)) {
            return new ServiceResponse("Service not found", false);
        }

        Order order = new Order();
        order.setUserId(userId);
        order.setServiceId(serviceId);
        order.setScheduledFor(LocalDateTime.now());
        order.setStatus(OrderStatus.PENDING);

        orders.add(order);
        return new ServiceResponse("Service Created Successfully", true);
    }

    public List<Order> getMyPreviousServices(String userId) {
        List<Order> userOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUserId().equals(userId)) {
                userOrders.add(order);
            }
        }
        return userOrders;
    }
}
