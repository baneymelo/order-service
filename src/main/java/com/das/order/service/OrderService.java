package com.das.order.service;

import com.das.order.dto.OrderDto;
import com.das.order.repository.IOrderRepository;
import com.das.order.utils.IParser;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    private final IOrderRepository orderRepository;
    private final IParser parser;

    public OrderService(IOrderRepository orderRepository, IParser parser) {
        this.orderRepository = orderRepository;
        this.parser = parser;
    }

    public OrderDto parseOrder(String jsonOrder) {
        if (jsonOrder == null || jsonOrder.isEmpty()) {
            throw new IllegalArgumentException("JSON order cannot be null or empty");
        }
        return parser.jsonToOrder(jsonOrder);
    }

    public void postOrder(String jsonOrder) throws IllegalArgumentException {
        if (jsonOrder == null || jsonOrder.isEmpty()) {
            throw new IllegalArgumentException("Order details cannot be null or empty");
        }
        OrderDto orderDto = this.parseOrder(jsonOrder);
        orderRepository.save(orderDto);
    }
}
