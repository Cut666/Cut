package com.example.quan_ly_ban_hang;

import com.example.quan_ly_ban_hang.model.*;
import com.example.quan_ly_ban_hang.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class QuanLyBanHangApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(QuanLyBanHangApplication.class, args);
    }
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ShopRepository shopRepository;
    @Autowired
    WalletRepository walletRepository;
    @Override
    public void run(String... args) throws Exception {
//        Customer customer = new Customer();
//        customer.setName("thai");
//        customer.setPhone("12345442");
//        customer.setAddress("NĐ");
//        customerRepository.save(customer);
//        Customer customer1 = new Customer();
//        customer1.setName("Hung");
//        customer1.setPhone("5984948");
//        customer1.setAddress("HP");
//        customerRepository.save(customer1);
////
//        Wallet wallet = new Wallet();
//        wallet.setAccountNum("1234556");
//        wallet.setBalance(20000000);
//        wallet.setCustomer(customer);
//        walletRepository.save(wallet);
//        Wallet wallet1 = new Wallet();
//        wallet1.setAccountNum("355454");
//        wallet1.setBalance(30000000);
//        wallet1.setCustomer(customer1);
//        walletRepository.save(wallet1);

//        Product product = new Product();
//        product.setName("điện thoại");
//        product.setQuantity(10);
//        product.setPrice(10000000);
//        product.setDescription("thiết bị điện tử");
//        productRepository.save(product);
//
//        Product product1 = new Product();
//        product1.setName("sách");
//        product1.setQuantity(30);
//        product1.setPrice(30000);
//        product1.setDescription("tài liệu");
//        productRepository.save(product1);
//
//        Product product2 = new Product();
//        product2.setName("bàn ghế");
//        product2.setQuantity(30);
//        product2.setPrice(500000);
//        product2.setDescription("gia dụng");
//        productRepository.save(product2);
//
//        Shop shop = new Shop();
//        shop.setName("tiki");
//        shop.setPhone("323428278");
//        shop.setProducts(Set.of(product,product1));
//        shopRepository.save(shop);
//
//        Shop shop1 = new Shop();
//        shop1.setName("lazada");
//        shop1.setPhone("342898238");
//        shop1.setProducts(Set.of(product2));
//        shopRepository.save(shop1);

//        Order order = new Order();
//        order.setProducts(Set.of(product,product1));
//        order.setCustomer(customer);
//
//        Order order1 = new Order();
//        order.setProducts(Set.of(product));
//        order.setCustomer(customer);

    }
}
