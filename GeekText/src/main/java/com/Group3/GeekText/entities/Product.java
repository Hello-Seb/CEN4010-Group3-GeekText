package com.Group3.GeekText.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "ShoppingCart")
public class Product {

    @Id
    @Column(name = "Id")
    public String id;
    @Column(name = "NameOfProduct")
    public String nameOfProduct;
    @Column(name = "AvailableQuantity")
    public int availableQuantity;
    @Column(name="Price")
    public float price;

    public String getId() {
        return id;
    }

    public void setId(String shoppingCartId) {
        this.id = shoppingCartId;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
