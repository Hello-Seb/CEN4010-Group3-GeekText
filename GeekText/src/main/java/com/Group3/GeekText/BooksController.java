package com.Group3.GeekText;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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


    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }

    //GET BY ISBN
    //GET BY AUTHOR

    @PostMapping("/books")
    public void postBooks(@RequestBody Books books) {
        booksRepository.save(books);
    }


}
