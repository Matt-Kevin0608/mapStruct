package com.thoughtworks.mapstruct.example5;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface StudentMapper {
    StudentDto toDto(Student student);

    List<StudentDto> toDto(List<Student> students);

    @MapMapping(valueDateFormat = "dd.MM.yyyy")
    Map<String, String> eventToDateMap(Map<Long, Date> source);

    Set<String> toStringSet(Set<Long> source);

}
