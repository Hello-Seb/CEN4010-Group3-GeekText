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
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RatingController {
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

    // GET method for computing the average rating of a book in decimal format

    /*
    @GetMapping("/books/{bookID}/averageRating")
    public ResponseEntity<Double> getAverageRating(@PathVariable Integer bookID){
        try{
            // This will retrieve all ratings for the given book
            List<Ratings> ratings = ratingsRepository.findByBookID(bookID);

            double sum = 0;
            for(Ratings rating : ratings){
                sum += rating.getRating();
            }
            double averageRating = sum / ratings.size();

            return ResponseEntity.ok(averageRating);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
     */
    @GetMapping("/books/{bookID}/averageRating")
    public ResponseEntity<Double> getAverageRating(@PathVariable Integer bookID){
        try{
            // This will retrieve all ratings for the given book
            List<Ratings> ratings = ratingsRepository.findByBookID(bookID);

            double sum = 0;
            for(Ratings rating : ratings){
                sum += rating.getRating();
            }

            double averageRating = 0.0;
            if (!ratings.isEmpty()) {
                averageRating = sum / ratings.size();
            }

            return ResponseEntity.ok(averageRating);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
