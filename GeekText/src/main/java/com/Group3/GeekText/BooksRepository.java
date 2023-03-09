package com.Group3.GeekText;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {
    List<Books> findAll();

}
