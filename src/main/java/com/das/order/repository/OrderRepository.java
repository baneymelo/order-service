package com.das.order.repository;

import com.das.order.dto.OrderDto;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository implements IOrderRepository {

    @Override
    public void save(OrderDto orderDto) {
        System.out.println("Order saved: " + orderDto);
    }
}
