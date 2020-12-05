package com.thoughtworks.mapstruct.custom.demo3;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

import java.util.Collections;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto toStudentDto(Student student);

    @BeforeMapping
    default void validate(Student student) {
        if (CollectionUtils.isEmpty(student.getHobbies())) {
            student.setHobbies(Collections.singletonList("none"));
        }
    }

    @AfterMapping
    default void update(@MappingTarget StudentDto studentDto) {
        studentDto.setName(studentDto.getName().toUpperCase());
    }
}
