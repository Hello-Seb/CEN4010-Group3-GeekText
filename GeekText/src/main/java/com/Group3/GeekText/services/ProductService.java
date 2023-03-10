package com.Group3.GeekText.services;

import com.Group3.GeekText.entities.Product;

import java.util.List;

public interface ProductService {
    //to save Product
    Product saveProduct(Product product);


    //to get All Product
    List<Product> getAllProducts();

    Product getProductById(long id);


}
