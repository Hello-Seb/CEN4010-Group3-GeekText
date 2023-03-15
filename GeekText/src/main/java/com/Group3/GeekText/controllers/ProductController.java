package com.Group3.GeekText.controllers;



import com.Group3.GeekText.entities.Product;
import com.Group3.GeekText.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/shopping-cart")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;

    }

    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);

    }

    @GetMapping("/get-all-products")
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    @GetMapping("{user-id}")
    public ResponseEntity<Product> getProductById(@PathVariable("user-id") long UserId){
        return new ResponseEntity<Product>(productService.getProductById(UserId), HttpStatus.OK);
    }
    @GetMapping("{user-id}/subtotal")
    public int getSubtotalPriceByUserId(@PathVariable("user-id") long UserId){
        return productService.getSubtotalPriceByUserId(UserId);
    }



}
