package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Ratings;
import com.Group3.GeekText.repositories.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RatingService {

    @Autowired
    private RatingsRepository ratingRepository;

    public Ratings createRating(int ratingValue, Long userId, Long bookId) {
        Ratings rating = new Ratings();
        rating.setRating(ratingValue);
        rating.setUserID(userId);
        rating.setBookID(bookId);
        rating.setDatestamp(new Date());
        return ratingRepository.save(rating);
    }
}

