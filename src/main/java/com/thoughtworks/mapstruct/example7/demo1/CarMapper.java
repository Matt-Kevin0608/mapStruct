package com.thoughtworks.mapstruct.example7.demo1;

import com.thoughtworks.mapstruct.example3.car.Car;
import com.thoughtworks.mapstruct.example3.car.CarDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "manufacturer", source = "make")
    @Mapping(target = "seatCount", source = "numberOfSeat")
    com.thoughtworks.mapstruct.example3.car.CarDto toDto(com.thoughtworks.mapstruct.example3.car.Car car);

    @InheritInverseConfiguration
    Car toDomainModel(CarDto carDto);
}
