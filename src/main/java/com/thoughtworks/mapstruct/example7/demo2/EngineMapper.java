package com.thoughtworks.mapstruct.example7.demo2;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EngineMapper {
    EngineMapper INSTANCE = Mappers.getMapper( EngineMapper.class );

    EngineDto toDto(Engine engine);
}
