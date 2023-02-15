package com.example.quan_ly_ban_hang.repository;

import com.example.quan_ly_ban_hang.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
