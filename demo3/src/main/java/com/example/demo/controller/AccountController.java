package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.model.Wallet;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private WalletRepository walletRepository;

    @GetMapping(value = "/acc/all")
    public ResponseEntity<List<Account>> getAll(){
        List<Account> accounts = accountRepository.findAll();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping(value = "/wall")
    public ResponseEntity<List<Wallet>> getAllWallet(){
        List<Wallet> wallets = walletRepository.findAll();
        return ResponseEntity.ok(wallets);
    }

    @GetMapping(value = "/acc/id")
    public ResponseEntity<List<Account>> getById(){
        List<Account> accounts= accountRepository.getAllById(1);
        return ResponseEntity.ok(accounts);
    }

    @GetMapping(value = "wall/balance")
    public ResponseEntity<List<Wallet>> getByBalance(){
        List<Wallet> wallets = walletRepository.getAllByBalance(15000000);
        return ResponseEntity.ok(wallets);
    }

    @PostMapping(value = "/wall/update")
    public ResponseEntity<String> updateBalance(@RequestBody Wallet wallet){
        Wallet wallet1 = walletRepository.findById(2).get();
        wallet1.setBalance(wallet.getBalance());
        walletRepository.save(wallet1);
        return ResponseEntity.ok("update thanh cong");
    }

}
