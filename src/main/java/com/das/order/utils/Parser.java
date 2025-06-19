package com.das.order.utils;

import com.das.order.dto.OrderDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
@Component
public class Parser implements IParser {


    @Override
    public OrderDto jsonToOrder(String jsonOrder) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            OrderDto orderDetails = objectMapper.readValue(jsonOrder, OrderDto.class);
            return orderDetails;

        } catch (Exception e) {
            throw new RuntimeException("Failed to parse JSON to OrderDto", e);
        }
    }
}
