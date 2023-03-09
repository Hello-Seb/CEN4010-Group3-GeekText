package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Books;
import org.springframework.web.bind.annotation.*;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.entities.Books;

import java.util.List;

@RestController
@RequestMapping("/")
public class BooksController {


    private final BooksRepository booksRepository;

    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }


    @GetMapping("/getAllBooks")
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    @PostMapping(value = "/addBook")
    public Books createBook(@RequestBody Books books){
        return books;
    }

}
