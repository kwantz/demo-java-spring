package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductServiceController {

    private static Map<Integer, Product> productRepo = new HashMap<>();

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProducts() {
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>(productRepo.get(product.getId()), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@RequestBody Product product, @PathVariable("id") Integer id) {
        if (!productRepo.containsKey(id))
            throw new ProductNotFoundException();

        productRepo.remove(id);
        productRepo.put(id, product);
        return new ResponseEntity<>(productRepo.get(product.getId()), HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delteProduct(@PathVariable("id") Integer id) {
        if (!productRepo.containsKey(id))
            throw new ProductNotFoundException();

        productRepo.remove(id);
        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    }
}
