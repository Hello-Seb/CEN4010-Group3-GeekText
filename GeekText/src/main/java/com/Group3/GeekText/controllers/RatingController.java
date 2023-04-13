package com.Group3.GeekText.controllers;


import com.Group3.GeekText.entities.Ratings;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.repositories.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class RatingController {


    /*
    @PostMapping(value = "/createRating", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Ratings createRating(@RequestParam int rating, @RequestParam Long userID, @RequestParam Long bookID){
        return ratingService.createRating(rating, userID, bookID);
    }
     */

    @Autowired
    private RatingsRepository ratingsRepository;

    // POST method for creating a new rating
    @PostMapping("/ratings")
    public ResponseEntity<?> createRating(@RequestBody Ratings ratingRequest) {
        try {
            // This will set the datestamp to the current date
            ratingRequest.setDatestamp(new Date());

            // Save the new rating to the database
            ratingsRepository.save(ratingRequest);

            // Return a success response
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            // If an error occurs, return an error response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
