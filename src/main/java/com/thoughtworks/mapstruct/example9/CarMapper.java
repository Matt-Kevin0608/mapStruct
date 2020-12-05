package com.thoughtworks.mapstruct.example9;

import org.mapstruct.Mapper;

@Mapper
public interface CarMapper {
    Car toDomain(CarDto dto);
}
