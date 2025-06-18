package com.das.order.controller;

import com.das.order.service.IOrderService;
import com.das.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @PostMapping("/add")
    public void addOrder(@RequestBody String orderDetails) {
        orderService.postOrder(orderDetails);
    }
}
