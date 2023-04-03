package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

@Repository
public interface BooksRepository extends CrudRepository<Books, String>{
    List<Books> findAll();
    List<Books> findByBookGenre(String bookGenre);

    List<Books> findByBookRatingsGreaterThanEqual(String bookRatings);

    @Query(value = "SELECT * from Books a where a.ISBN = ?1", nativeQuery = true)
    List<Books> findBookByIsbn(String ISBN);

    @Query(value = "SELECT b from Books b where b.bookID = :bookID", nativeQuery = true)
    List<Books> findBooksByBookID(@Param("bookID") String bookID);
}
