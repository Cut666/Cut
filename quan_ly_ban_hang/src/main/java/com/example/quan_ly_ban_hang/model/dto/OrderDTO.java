package com.example.quan_ly_ban_hang.model.dto;

import com.example.quan_ly_ban_hang.model.Customer;
import com.example.quan_ly_ban_hang.model.Product;
import lombok.Data;

import java.util.Set;

@Data
public class OrderDTO {
    private int ord_id;
    private Set<Product>products;
    private Customer customer;
    private double price;
}
