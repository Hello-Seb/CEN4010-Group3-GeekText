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



}
