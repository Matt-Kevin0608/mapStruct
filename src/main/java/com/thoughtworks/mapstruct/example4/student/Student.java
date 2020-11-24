package com.thoughtworks.mapstruct.example4.student;

import com.thoughtworks.mapstruct.example4.student.Address.Address;
import com.thoughtworks.mapstruct.example4.student.GenderEum.GenderEnum;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Builder
@Getter
public class Student {
    private String name;
    private Long id;
    private Address address;
    private GenderEnum gender;
    private Instant birthday;
}
