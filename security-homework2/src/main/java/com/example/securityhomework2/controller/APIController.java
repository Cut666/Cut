package com.example.securityhomework2.controller;

import com.example.securityhomework2.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(name = "/api")
public class APIController {
    @GetMapping("/product")
    public List<Product> productList (){
        List<Product> products = new ArrayList<>();
        products.add(new Product("ao",15000));
        products.add(new Product("quan",20000));
        return products;
    };
    @GetMapping("/update")
    public String update(){
        return null;
    }
    @GetMapping("/delete")
    public String delete(){
        return null;
    }
}
