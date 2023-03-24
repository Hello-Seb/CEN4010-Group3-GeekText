package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

@Repository
public interface BooksRepository extends CrudRepository<Books, String> {
    List<Books> findAll();
    List<Books> findByBookGenre(String bookGenre);

    @Query(value = "SELECT * from Books a where a.ISBN = ?1", nativeQuery = true)
    List<Books> findBookByIsbn(String ISBN);

}
