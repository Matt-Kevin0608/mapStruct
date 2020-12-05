package com.thoughtworks.mapstruct.custom.demo3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class StudentDto {
    private String name;
    private List<String> hobbies;
}
