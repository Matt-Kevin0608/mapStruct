package com.thoughtworks.mapstruct.example7.demo2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EngineMapper {
    EngineMapper INSTANCE = Mappers.getMapper( EngineMapper.class );

    @Mapping(source = "type", target = "typeName")
    EngineDto toDto(Engine engine);
}
