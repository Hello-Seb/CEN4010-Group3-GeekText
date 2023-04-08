package com.Group3.GeekText.controllers;


import com.Group3.GeekText.entities.Ratings;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.repositories.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    /*
    @PostMapping(value = "/createRating", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Ratings createRating(@RequestParam int rating, @RequestParam Long userID, @RequestParam Long bookID){
        return ratingService.createRating(rating, userID, bookID);
    }
     */

    @PostMapping(value = "/createRating", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Ratings createRating(@RequestBody Ratings ratings){
        return ratingService.createRating(ratings.getRating(), ratings.getUserID(), ratings.getBookID());
    }

}
