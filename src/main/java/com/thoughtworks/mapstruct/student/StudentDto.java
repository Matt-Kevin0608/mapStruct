package com.thoughtworks.mapstruct.student;

import com.thoughtworks.mapstruct.student.Address.AddressDto;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StudentDto {
    private String name;
    private String id;
    private AddressDto address;
    private String gender;
    private long birthday;
}
