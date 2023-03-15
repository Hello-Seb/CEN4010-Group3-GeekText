package com.Group3.GeekText.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ShoppingCart")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NameOfProduct")
    private String nameOfProduct;

    @Column(name = "AvailableQuantity")
    private int availableQuantity;

    @Column(name="Price")
    private float price;


}
