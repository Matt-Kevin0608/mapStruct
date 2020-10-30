package com.thoughtworks.mapstruct.product;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductDto {
    private String name;
    private String company;
    private int count;
    private String color;
}
