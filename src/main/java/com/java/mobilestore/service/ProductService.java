package com.java.mobilestore.service;

import com.java.mobilestore.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveOrUpDate(Product product);

    List<Product> getAll();
}
