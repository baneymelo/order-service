package com.das.order.service;

import com.das.order.dto.OrderDto;

public interface IOrderService {
    void postOrder(String orderDetails) throws IllegalArgumentException;
    OrderDto parseOrder(String jsonOrder) throws IllegalArgumentException;
}
