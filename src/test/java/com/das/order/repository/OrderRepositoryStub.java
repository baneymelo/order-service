package com.das.order.repository;

import com.das.order.dto.OrderDto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;


@Data
@Builder
public class OrderRepositoryStub implements IOrderRepository {

    private int saveInvocations = 0;

    @Override
    public void save(OrderDto orderDto) {
        saveInvocations++;
    }

    @Override
    public List<OrderDto> findAll() {
        return List.of();
    }
}