package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.services.BooksService;

import java.util.*;

@RestController
@RequestMapping("/")

public class BooksController {
    @Autowired
    private BooksService booksService;
    private final BooksRepository booksRepository;

    public BooksController(BooksService booksService, BooksRepository booksRepository) {
        this.booksService = booksService;
        this.booksRepository = booksRepository;
    }

    @GetMapping("/getAllBooks")
    public List<Books> getBooks() {
        return booksService.findAll();
    }

    @GetMapping("/byIsbn/{ISBN}")
    public List<Books> getBookByIsbn(@PathVariable("ISBN") String ISBN){
        List<Books> isbnSearch = booksService.findBookByIsbn(ISBN);
        return isbnSearch;
    }

    @GetMapping("/genre/{bookGenre}")
    public List<Books> getBooksByBookGenre(@PathVariable String bookGenre){
        return booksService.getBooksByBookGenre(bookGenre);
    }

    @PostMapping("/books")
    public void createBook(@RequestBody Books books) {
        booksRepository.save(books);
    }
}
