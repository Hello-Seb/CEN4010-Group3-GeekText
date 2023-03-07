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
        Books newBook = new Books();
        newBook.setBookID(books.getBookID());
        newBook.setBookName(books.getBookName());
        newBook.setBookDescription(books.getBookDescription());
        newBook.setBookAuthor(books.getBookAuthor());
        newBook.setBookGenre(books.getBookGenre());
        newBook.setBookSoldCopies(books.getBookSoldCopies());
        newBook.setBookRatings(books.getBookRatings());
        newBook.setBookPublisher(books.getBookPublisher());
        newBook.setBookPrice(books.getBookPrice());
        newBook.setBookISBN(books.getBookISBN());
        newBook.setBookPublishYear(books.getBookPublishYear());
        newBook.setBookComments(books.getBookComments());
        booksRepository.save(newBook);
    }


}
