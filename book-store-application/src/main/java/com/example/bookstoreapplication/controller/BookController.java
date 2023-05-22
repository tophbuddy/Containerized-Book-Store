package com.example.bookstoreapplication.controller;

import com.example.bookstoreapplication.service.BookService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // endpoints for handling books
}
