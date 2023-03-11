package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface BooksRepository extends CrudRepository<Books, Long> {
    List<Books> findAll();

    @Query("SELECT a FROM Books a WHERE a.bookISBN =?1")
    List<Books> findBookByIsbn(String ISBN);

}