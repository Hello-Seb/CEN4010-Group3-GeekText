package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.services.BooksService;



import java.util.List;

@RestController
@RequestMapping("/")

public class BooksController {
    @Autowired
    private BooksService booksService;
    /*@Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }*/

    @GetMapping("/getAllBooks")
    public List<Books> getBooks() {
        return booksService.findAll();
    }
    @PostMapping(value = "/addBook")
    public Books createBook(@RequestBody Books books){
        return books;
    }

    @GetMapping("/genre/{bookGenre}")
    public List<Books> getBooksByBookGenre(@PathVariable String bookGenre){
        return booksService.getBooksByBookGenre(bookGenre);
    }
}
