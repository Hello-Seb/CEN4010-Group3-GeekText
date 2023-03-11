package com.Group3.GeekText.services;

import com.Group3.GeekText.entities.Books;
import com.Group3.GeekText.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Group3.GeekText.entities.Profile;
import java.util.Collection;
import java.util.Optional;
import java.util.*;

@Service
public class BookService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> findBookByIsbn(String ISBN){
        return booksRepository.findBookByIsbn(ISBN);
    }

}