package com.thoughtworks.mapstruct.deepCopy;

import org.mapstruct.Mapper;
import org.mapstruct.control.DeepClone;

@Mapper(mappingControl = DeepClone.class)
//@Mapper
public interface StudentMapper {
    StudentDto toDto(Student student);
}
