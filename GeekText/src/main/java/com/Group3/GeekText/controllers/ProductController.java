package com.Group3.GeekText.controllers;



import com.Group3.GeekText.entities.Product;
import com.Group3.GeekText.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shopping-cart")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/get-all-products")
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

}
