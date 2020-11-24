package com.thoughtworks.mapstruct.example3.car;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Car {
    private String make;
    private int numberOfSeat;
    private String brand;
    private String color;
    private String id;
}
