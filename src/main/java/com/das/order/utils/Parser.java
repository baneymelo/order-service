package com.das.order.utils;

import com.das.order.dto.OrderDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Parser implements IParser {

    private ObjectMapper objectMapper;

    @Override
    public OrderDto jsonToOrder(String jsonOrder) {
        try {
            OrderDto orderDto = this.objectMapper.readValue(jsonOrder, OrderDto.class);
            return orderDto;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse JSON to OrderDto", e);
        }
    }
}
