package com.Group3.GeekText.services;

import com.Group3.GeekText.entities.Books;
import com.Group3.GeekText.entities.Product;


import java.util.List;

public interface ProductService {


    //to get All Product
    List<Product> getAllProducts();


    //get product by userId
    List<Books> getProductsByUserId(long userId);


    //add product to the shopping cart given a userId and an BookId
    void addItemToCart(Long userId, int bookId) throws Exception;

    //Retrieve the subtotal price of all items in the user's shoppingCart given a userId
    double getSubtotalPrice(long userId);
}
