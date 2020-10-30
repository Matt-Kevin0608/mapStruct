package com.thoughtworks.mapstruct.car;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "manufacturer", source = "make")
    @Mapping(target = "seatCount", source = "numberOfSeat")
    CarDto toDto(Car car);
}
