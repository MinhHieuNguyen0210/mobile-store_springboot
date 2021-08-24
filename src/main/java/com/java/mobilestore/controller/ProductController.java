package com.java.mobilestore.controller;

import com.java.mobilestore.entity.Product;
import com.java.mobilestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/admin/product/all")
    public ResponseEntity<List<Product>>getAllProduct(){
        try {
            List<Product> listProduct = productService.getAll();
            return new ResponseEntity<>(listProduct,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/add")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        try {
            Product _product = productService.saveOrUpDate(product);
            return new ResponseEntity<>(_product, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }


}
