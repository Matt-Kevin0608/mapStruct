package com.thoughtworks.mapstruct.example7.demo1;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CarDto {
    private String id;
    private int seatCount;
    private String manufacturer;
    private String brand;
    private String color;
}
