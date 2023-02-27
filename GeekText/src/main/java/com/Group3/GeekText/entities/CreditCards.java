package com.Group3.GeekText.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "CreditCards")
public class CreditCards {

    @Id
    @Column(name = "CreditCardNumber")
    public String creditCardNumber;

    @Column(name = "Name")
    public String name;
    @Column(name = "CVV")
    public int cvv;


    /*
    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    public int getCVV() {
        return cvv;
    }
    public void setCVV(int cvv) {
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    */

}
