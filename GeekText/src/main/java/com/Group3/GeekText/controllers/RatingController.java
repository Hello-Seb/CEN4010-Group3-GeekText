package com.Group3.GeekText.controllers;


import com.Group3.GeekText.entities.Ratings;
import com.Group3.GeekText.repositories.BooksRepository;
import com.Group3.GeekText.repositories.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RatingController {
    @Autowired
    private RatingService ratingService;


    @PostMapping("/ratings")
    public Ratings createRating(@RequestParam int rating, @RequestParam Long userID, @RequestParam Long bookID){
        return ratingService.createRating(rating, userID, bookID);
    }


}
