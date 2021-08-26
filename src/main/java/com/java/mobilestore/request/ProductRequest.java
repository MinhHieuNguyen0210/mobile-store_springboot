package com.java.mobilestore.request;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

    private String productName;

    private double unitPrice;

    private int unitInStock;

    private String description;

    private String manufacturer;

    private String image;

    private int condition;

    private String category;

}
