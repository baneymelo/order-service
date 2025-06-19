package com.das.order.controller;

import com.das.order.dto.OrderDto;
import com.das.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @PostMapping("/add")
    public void addOrder(@RequestBody String orderDetails) {
        orderService.postOrder(orderDetails);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<OrderDto> allOrders() {
        return orderService.getAllOrders();
    }
}
