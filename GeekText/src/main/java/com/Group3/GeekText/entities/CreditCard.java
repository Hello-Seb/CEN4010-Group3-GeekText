package com.Group3.GeekText.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "CreditCards")
public class CreditCard {

    @Id
    @JsonBackReference
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CreditCardID", nullable = false)
    private long creditCardID;


    @Column(name = "Cardholder")
    private String cardholder;
    @Column(name = "CVV")
    private int cvv;
    @Column(name = "CreditCardNumber")
    private String creditCardNumber;
    @Column(name = "BillingAddress")
    private String billingAddress;
    @Column(name = "ExpirationDate")
    private String expirationDate;

    public long getCreditCardID() {return creditCardID;}
    public void setCreditCardID(long creditCardID) {this.creditCardID = creditCardID;}

    public String getCardholder() {return cardholder;}
    public void setCardholder(String cardholder) {this.cardholder = cardholder;}

    public int getCvv() {return cvv;}
    public void setCvv(int cvv) {this.cvv = cvv;}

    public String getCreditCardNumber() {return creditCardNumber;}
    public void setCreditCardNumber(String creditCardNumber) {this.creditCardNumber = creditCardNumber;}

    public String getBillingAddress() {return billingAddress;}
    public void setBillingAddress(String billingAddress) {this.billingAddress = billingAddress;}

    public String getExpirationDate() {return expirationDate;}
    public void setExpirationDate(String expirationDate) {this.expirationDate = expirationDate;}
}
