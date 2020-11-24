package com.thoughtworks.mapstruct.example0;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Student {
    private String name;
    private String id;
    private String gender;
    private int age;
    private List<String> hobbies;
    private String classroom;
    private String teacher;
}
