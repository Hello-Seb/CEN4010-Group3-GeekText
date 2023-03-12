package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;



@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
    List<Books> findAll();
    List<Books> findByBookGenre(String bookGenre);
}
