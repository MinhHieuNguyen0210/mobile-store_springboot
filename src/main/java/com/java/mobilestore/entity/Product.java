package com.java.mobilestore.entity;

import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

@Getter
@Setter
@ToString
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue
    private int id;

    @Column(name="product_name")
    private String productName;

    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="unit_in_stock")
    private int unitInStock;

    @Column(name="description")
    private String description;

    @Column(name="manufacturer")
    private String manufacturer;

    @Column(name="image_url")
    private String image;

    @Column(name="conditions")
    private int condition;

    @Column(name="category")
    private String category;


}
