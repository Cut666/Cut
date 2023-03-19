package com.example.securityb5.controller;

import com.example.securityb5.model.Book;
import com.example.securityb5.repository.BookRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;
    @GetMapping("/getall")
    public ResponseEntity<List<Book>> getAll(){
        return ResponseEntity.ok(bookRepository.findAll());
    }
    @GetMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam int id){
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
        return ResponseEntity.ok("delete thanh cong");
    }
}
