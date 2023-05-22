package com.example.bookstoreapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private Long id;

    // other fields, getters and setters
}
