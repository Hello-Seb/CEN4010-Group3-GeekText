package com.Group3.GeekText.services;

import com.Group3.GeekText.entities.Product;
import com.Group3.GeekText.repositories.ProductRepository;

import java.util.List;

public interface ProductService {
    //to save Product
    Product saveProduct(Product product);


    //to get All Product
    List<Product> getAllProducts();

    Product getProductById(long UserId);

    //Retrieve the subtotal price of all items in the user's shoppingCart given a userId
    int getSubtotalPriceByUserId(long UserId);
}
