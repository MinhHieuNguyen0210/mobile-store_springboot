package com.java.mobilestore.service.impl;

import com.java.mobilestore.entity.Product;
import com.java.mobilestore.repository.ProductRepository;
import com.java.mobilestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product saveOrUpDate(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
       return productRepository.findAll();
    }
}
