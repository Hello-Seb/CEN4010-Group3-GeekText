package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {
    List<Comments> findByBookID(Integer bookID);
}
