package com.thoughtworks.mapstruct.example0;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String name;
    private String id;
    private String gender;
    private int age;
    private List<String> hobbies;
    private String classroom;
    private String teacher;
}
