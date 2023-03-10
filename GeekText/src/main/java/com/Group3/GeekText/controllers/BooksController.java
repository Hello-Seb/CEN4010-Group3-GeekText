package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Profile;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.entities.Books;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


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


    //GET BY ISBN
    //GET BY AUTHOR

    @PostMapping("/books")
    public void postBooks(@RequestBody Books books) {
        booksRepository.save(books);
    }


}
