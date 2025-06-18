package com.das.order.repository;

import com.das.order.dto.OrderDto;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository {
    void save(OrderDto orderDto);
}
