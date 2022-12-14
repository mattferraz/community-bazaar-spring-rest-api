package com.tads.mhsf.bazaar.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private String brand;
    private String category;
    private String description;
    private ProductsBatch productsBatch;
}
