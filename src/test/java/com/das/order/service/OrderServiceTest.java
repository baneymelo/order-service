package com.das.order.service;

import com.das.order.repository.OrderRepositoryStub;
import com.das.order.utils.IParser;
import com.das.order.utils.Parser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    public void postOrderSuccessfully() {
        // given
        String json = "{\"quantity\":1,\"product\":\"product_1\",\"price\":29.99,\"customerName\":\"customer_1\"}";
        OrderRepositoryStub orderRepositoryStub = OrderRepositoryStub.builder().build();
        IParser parser = Parser.builder().build();
        OrderService orderService = new OrderService(orderRepositoryStub, parser);

        // when
        orderService.postOrder(json);

        // then
        assertEquals(1, orderRepositoryStub.getSaveInvocations());
    }
}