package com.Group3.GeekText.services.Impl;

import com.Group3.GeekText.entities.Books;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class  BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Books> getBooksByBookGenre(String bookGenre) {
        return booksRepository.findByBookGenre(bookGenre);
    }

    @Override
    public List<Books> findAll() {
        return booksRepository.findAll();
    }
    @Override
    public List<Books> getBooksByBookRatings(String bookRatings){return booksRepository.findByBookRatingsGreaterThanEqual(bookRatings);}

    @Override
    public List<Books> findBookByIsbn(String ISBN) {
        return booksRepository.findBookByIsbn(ISBN);
    }



}
