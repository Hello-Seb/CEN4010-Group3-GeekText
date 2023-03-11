package com.Group3.GeekText.controllers;

import com.Group3.GeekText.services.BookService;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.entities.Books;
import com.Group3.GeekText.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    BookService bookService;
    private final BooksRepository booksRepository;

    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping("/getAllBooks")
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }


    //GET BY ISBN
    @GetMapping("/byIsbn/{ISBN}")
    public List<Books> getBookByIsbn(@PathVariable("ISBN") String ISBN){
        List<Books> isbnSearch = bookService.findBookByIsbn(ISBN);
        return isbnSearch;
    }
    //GET BY AUTHOR

    @PostMapping("/books")
    public void postBooks(@RequestBody Books books) {
        booksRepository.save(books);
    }


}
