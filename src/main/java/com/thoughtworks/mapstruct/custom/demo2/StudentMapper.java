package com.thoughtworks.mapstruct.custom.demo2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.Instant;
import java.util.UUID;

@Mapper(imports = {UUID.class, Instant.class})
public interface StudentMapper {

    @Mapping(target = "id", expression = "java(UUID.randomUUID().toString())")
    @Mapping(target = "happyTime", defaultExpression = "java(Instant.now())")
    StudentDto toDto(Student student);
}
