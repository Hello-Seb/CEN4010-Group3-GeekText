package com.Group3.GeekText.repositories;


import com.Group3.GeekText.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long > {

}
