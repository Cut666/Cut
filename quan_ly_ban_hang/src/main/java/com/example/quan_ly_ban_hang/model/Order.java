package com.example.quan_ly_ban_hang.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double price;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @JsonManagedReference
    @ManyToMany
    @JoinTable(name = "order_pro", joinColumns = @JoinColumn(name = "ord_id"), inverseJoinColumns = @JoinColumn(name = "pro_id"))
    private Set<Product> products;
}
