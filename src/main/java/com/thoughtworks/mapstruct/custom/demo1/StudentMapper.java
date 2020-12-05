package com.thoughtworks.mapstruct.custom.demo1;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.util.StringUtils;

@Mapper
public interface StudentMapper {

    @Mapping(target = "name", source = "name", qualifiedByName = "addNickyName")
    StudentDto toDto(Student student);

    @Named("addNickyName")
    default String addNickyName(String name) {
        return name + " xiaotiantian";
    }
}
