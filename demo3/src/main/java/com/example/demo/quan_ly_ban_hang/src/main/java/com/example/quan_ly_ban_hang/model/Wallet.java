package com.example.quan_ly_ban_hang.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String accountNum;
    private float balance;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
