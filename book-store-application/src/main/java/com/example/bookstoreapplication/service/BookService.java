package com.example.bookstoreapplication.service;

import com.example.bookstoreapplication.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // other methods for handling books
}
