package com.example.securityb5.service;

import com.example.securityb5.model.Book;
import com.example.securityb5.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceIplm implements BookService{
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> getall() {
        return bookRepository.findAll();
    }
}
