package com.das.order.repository;

import com.das.order.dto.OrderDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository {
    void save(OrderDto orderDto);
    List<OrderDto> findAll();
}
