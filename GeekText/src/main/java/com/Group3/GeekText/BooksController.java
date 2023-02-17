package com.Group3.GeekText;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }



}
