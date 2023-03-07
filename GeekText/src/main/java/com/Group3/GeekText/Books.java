package com.Group3.GeekText;

import org.springframework.data.repository.CrudRepository;
import jakarta.persistence.*;


@Entity
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "BookID")
    public String bookID;
    @Column(name = "BookName")
    public String bookName;
    @Column(name = "BookDescription")
    public String bookDescription;
    @Column(name = "Author")
    public String bookAuthor;
    @Column(name = "Genre")
    public String bookGenre;
    @Column(name = "CopiesSold")
    public String bookSoldCopies;
    @Column(name = "Rating")
    public String bookRatings;
    @Column(name = "Publisher")
    public String bookPublisher;
    @Column(name = "Price")
    public String bookPrice;

    @Column(name = "ISBN")
    public String bookISBN;
    @Column(name = "MadeYear")
    public String bookPublishYear;

    @Column(name = "Comments")
    public String bookComments;

    public Books(){

    }


    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookSoldCopies() {
        return bookSoldCopies;
    }

    public void setBookSoldCopies(String bookSoldCopies) {
        this.bookSoldCopies = bookSoldCopies;
    }

    public String getBookRatings() {
        return bookRatings;
    }

    public void setBookRatings(String bookRatings) {
        this.bookRatings = bookRatings;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookPublishYear() {
        return bookPublishYear;
    }

    public void setBookPublishYear(String bookPublishYear) {
        this.bookPublishYear = bookPublishYear;
    }

    public String getBookComments() {
        return bookComments;
    }

    public void setBookComments(String bookComments) {
        this.bookComments = bookComments;
    }
}

