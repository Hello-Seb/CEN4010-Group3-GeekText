package com.Group3.GeekText.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Ratings")

public class Ratings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "bookID")
    private Long bookID;

    @Column(name = "userID")
    private Long userID;

    @Column(name = "rating")
    private int rating;

    @Column(name = "datestamp")
    private Date datestamp;


    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getDatestamp() {
        return datestamp;
    }

    public void setDatestamp(Date datestamp) {
        this.datestamp = datestamp;
    }
    @Override
    public String toString() {
        return "Ratings{" +
                "bookID=" + bookID +
                ", userID=" + userID +
                ", rating=" + rating +
                '}';
    }

}
