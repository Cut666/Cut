package com.example.quan_ly_ban_hang.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    private float price;
    private String description;


    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
    @JsonBackReference
    @ManyToMany(mappedBy = "products")
    Set<Order> orders;
}
