package com.example.quan_ly_ban_hang.repository;

import com.example.quan_ly_ban_hang.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {
}
