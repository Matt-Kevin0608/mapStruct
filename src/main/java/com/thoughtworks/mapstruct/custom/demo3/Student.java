package com.thoughtworks.mapstruct.custom.demo3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private List<String> hobbies;
}
