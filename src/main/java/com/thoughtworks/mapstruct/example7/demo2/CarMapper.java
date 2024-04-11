package com.thoughtworks.mapstruct.example7.demo2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = EngineMapper.class)
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "engine", target = "engineDto")
    CarDto toDto(Car car);

}