package com.das.order.utils;

import com.das.order.dto.OrderDto;
import org.springframework.stereotype.Component;

@Component
public interface IParser {
    OrderDto jsonToOrder(String jsonOrder);
}
