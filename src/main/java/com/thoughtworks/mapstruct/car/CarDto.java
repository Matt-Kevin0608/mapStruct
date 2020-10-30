package com.thoughtworks.mapstruct.car;

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
