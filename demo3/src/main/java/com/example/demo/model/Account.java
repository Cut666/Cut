package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @OneToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

}
