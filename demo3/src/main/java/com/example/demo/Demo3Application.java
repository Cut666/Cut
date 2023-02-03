package com.example.demo;

import com.example.demo.model.Account;
import com.example.demo.model.Wallet;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private WalletRepository walletRepository;
    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Wallet wallet = new Wallet();
//        wallet.setBalance(15000000);
//
//        Wallet wallet1 = new Wallet();
//        wallet1.setBalance(20000000);
//
//        Wallet wallet2 = new Wallet();
//        wallet2.setBalance(12000000);
//
//        walletRepository.save(wallet);
//        walletRepository.save(wallet1);
//        walletRepository.save(wallet2);
//
//        Account account = new Account();
//        account.setPassword("thai123");
//        account.setUsername("thai");
//        account.setWallet(wallet);
//
//        Account account1 = new Account();
//        account1.setPassword("hung123");
//        account1.setUsername("hung");
//        account1.setWallet(wallet1);
//
//        accountRepository.save(account);
//        accountRepository.save(account1);
    }
}
