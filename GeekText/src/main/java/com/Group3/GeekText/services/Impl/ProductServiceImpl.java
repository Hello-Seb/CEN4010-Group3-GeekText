package com.Group3.GeekText.services.Impl;

import com.Group3.GeekText.entities.Product;
import com.Group3.GeekText.exeption.ResourceNotFoundException;
import com.Group3.GeekText.repositories.ProductRepository;
import com.Group3.GeekText.services.ProductService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        super();
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get();
        }else{
            throw new ResourceNotFoundException("Product", "Id", id);
        }
    }

}
