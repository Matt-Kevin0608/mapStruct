package com.thoughtworks.mapstruct.example7.demo1;

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
