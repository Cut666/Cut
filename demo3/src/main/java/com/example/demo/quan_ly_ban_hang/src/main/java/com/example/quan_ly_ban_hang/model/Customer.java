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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    private String address;
    @OneToOne
    @JoinColumn(name = "Wallet_id")
    private Wallet wallet;
    @JsonBackReference
    @OneToMany
    private Set<Order> orders;
}
