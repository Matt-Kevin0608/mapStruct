package com.thoughtworks.mapstruct.student;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.Instant;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "address.communityName", source = "address.community")
    @Mapping(target = "address.streetName", source = "address.street")
    @Mapping(target = "address.departmentName", source = "address.department")
    StudentDto toDto(Student student);

    default long InstantToLong (Instant instant) {
        return instant.toEpochMilli();
    }
}
