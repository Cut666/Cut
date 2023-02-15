package com.example.quan_ly_ban_hang.service;

import com.example.quan_ly_ban_hang.model.Customer;
import com.example.quan_ly_ban_hang.model.Order;
import com.example.quan_ly_ban_hang.model.Product;
import com.example.quan_ly_ban_hang.model.dto.OrderDTO;
import com.example.quan_ly_ban_hang.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private WalletRepository walletRepository;
    @Override
    public Order createOrder(OrderDTO dto) {
        Order order1 = new Order();
        ModelMapper mapper = new ModelMapper();
        Set<Product> product = dto.getProducts().stream().map(product1 -> mapper.map(product1, Product.class)).collect(Collectors.toSet());
        for (Product p : product) {
            Product product2 = productRepository.findById(p.getId()).get();
            product2.setQuantity(product2.getQuantity() - p.getQuantity());
            productRepository.save(product2);
        }
        order1.setProducts(product);
        Customer customer1 = customerRepository.findByPhone(dto.getCustomer().getPhone());
        order1.setCustomer(customer1);
        order1.setPrice(totalPrice(dto.getProducts()));
        orderRepository.save(order1);
        return order1;

    }private double totalPrice(Set<Product> dto) {
        double price = 0;
        for (Product product : dto) {
            price += product.getPrice() * product.getQuantity();
        }
        return price;
    }
}
