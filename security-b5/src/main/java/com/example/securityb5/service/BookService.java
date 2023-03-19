package com.example.securityb5.service;

import com.example.securityb5.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    public List<Book> getall();
}
