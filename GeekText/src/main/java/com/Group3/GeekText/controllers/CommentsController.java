package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Comments;
import com.Group3.GeekText.repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class CommentsController {
    @Autowired
    private CommentsRepository commentsRepository;

    // POST method for creating a new comment
    @PostMapping("/comments")
    public ResponseEntity<?> createComment(@RequestBody Comments commentRequest){
        try{
            // This will set the datestamp to the current date
            commentRequest.setDatestamp(new Date());

            //Save the new comment to the database
            commentsRepository.save(commentRequest);

            // Return a success response
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            // If an error occurs, return an error response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
