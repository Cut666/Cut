package com.example.quan_ly_ban_hang.repository;

import com.example.quan_ly_ban_hang.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
