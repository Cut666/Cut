package com.example.quan_ly_ban_hang.Controller;

import com.example.quan_ly_ban_hang.model.Order;
import com.example.quan_ly_ban_hang.model.dto.OrderDTO;
import com.example.quan_ly_ban_hang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/order/create")
    public ResponseEntity<?> createOrd(@RequestBody OrderDTO order){
        return ResponseEntity.ok(orderService.createOrder(order));
    }
}
