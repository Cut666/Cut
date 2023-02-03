package com.example.demo.repository;

import com.example.demo.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {

    List<Wallet> getAllByBalance(long banlance);
}
