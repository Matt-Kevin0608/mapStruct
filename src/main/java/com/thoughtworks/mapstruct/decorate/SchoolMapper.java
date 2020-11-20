package com.thoughtworks.mapstruct.decorate;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SchoolMapper {

    SchoolMapper INSTANCE = Mappers.getMapper(SchoolMapper.class);


    School toDomain(SchoolEntity schoolEntity);
}
