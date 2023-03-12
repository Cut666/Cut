package com.example.security_homework4.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping("/add")
    public String read(){return "read";};
    @GetMapping("/update/{id}")
    public String update(){
      return "update";
    }
    @GetMapping("/delete/{id}")
    public String delete(){
        return "delete";
    }
    @GetMapping("/search")
    public String search(){ return "search";};
}
