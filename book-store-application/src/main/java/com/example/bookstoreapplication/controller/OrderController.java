package com.example.bookstoreapplication.controller;

import com.example.bookstoreapplication.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
}
