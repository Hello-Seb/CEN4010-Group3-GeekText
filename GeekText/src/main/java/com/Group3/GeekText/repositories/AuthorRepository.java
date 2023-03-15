package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface AuthorRepository extends CrudRepository<Author, Long>{

    List<Author> findAll();

}
