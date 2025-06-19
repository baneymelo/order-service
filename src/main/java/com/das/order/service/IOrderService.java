package com.das.order.service;

import com.das.order.dto.OrderDto;

import java.util.List;

public interface IOrderService {
    void postOrder(String orderDetails) throws IllegalArgumentException;
    List<OrderDto> getAllOrders() throws IllegalArgumentException;
    OrderDto parseOrder(String jsonOrder) throws IllegalArgumentException;
}
