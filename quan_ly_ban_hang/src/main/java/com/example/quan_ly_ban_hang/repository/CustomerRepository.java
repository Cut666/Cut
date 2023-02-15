package com.example.quan_ly_ban_hang.repository;

import com.example.quan_ly_ban_hang.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByPhone(String phone);
}
