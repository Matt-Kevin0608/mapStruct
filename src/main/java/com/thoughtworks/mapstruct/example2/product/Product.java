package com.thoughtworks.mapstruct.example2.product;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Product {
    private String name;
    private String company;
    private int count;
    private String color;
}
