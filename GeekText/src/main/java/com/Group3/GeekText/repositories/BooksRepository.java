package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends CrudRepository<Books, Long> {
    List<Books> findAll();

}