package com.example.quan_ly_ban_hang.service;

import com.example.quan_ly_ban_hang.model.Order;
import com.example.quan_ly_ban_hang.model.dto.OrderDTO;

public interface OrderService {
    Order createOrder(OrderDTO dto);
}
