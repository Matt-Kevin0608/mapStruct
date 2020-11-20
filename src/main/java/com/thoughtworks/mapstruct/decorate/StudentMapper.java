package com.thoughtworks.mapstruct.decorate;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@DecoratedWith(StudentMapperDecorate.class)
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper( StudentMapper.class );

    Student toStudent(StudentEntity studentEntity);
}
