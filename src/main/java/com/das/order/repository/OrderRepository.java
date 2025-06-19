package com.das.order.repository;

import com.das.order.dto.OrderDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository implements IOrderRepository {

    @Override
    public void save(OrderDto orderDto) {
        System.out.println("Order saved: " + orderDto);
    }

    @Override
    public List<OrderDto> findAll() {
        // TODO replace with a implementation that retrieves from a database
        OrderDto order1 = OrderDto.builder()
                .id(1L)
                .product("Product A")
                .customerName("Customer A")
                .postingDate(new java.sql.Timestamp(System.currentTimeMillis()))
                .status("Pending")
                .quantity(1)
                .price(10.0)
                .build();

        return List.of(order1);
    }
}
