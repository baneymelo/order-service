package com.das.order.controller;

import com.das.order.dto.OrderDto;
import com.das.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Value("${URL_USER_SERVICE}")
    private String urlUserService;

    @PostMapping("/order/add")
    public void addOrder(@RequestBody String orderDetails) {
        log.info("order service :: posting order");
        orderService.postOrder(orderDetails);
    }

    @GetMapping("/order/all")
    @ResponseBody
    public List<OrderDto> allOrders() {
        log.info("order service :: getting all orders");
        log.info("URL_USER_SERVICE :: {}", urlUserService);
        return orderService.getAllOrders();
    }

   /* @GetMapping("/user")
    @ResponseBody
    public String getUser(@RequestParam(name = "userId", required = true) Long userId) {
        log.info("order service :: connecting to user service for userId {}", userId);
        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = urlUserService + "/user/get?userId=" + userId;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            String res = response.getBody();
            log.info(res);
            return res;
         } else {
            log.info("Error: " + response.getStatusCode());
            return "Error fetching user data";
         }
    }*/
}
