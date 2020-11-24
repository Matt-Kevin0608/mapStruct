package com.thoughtworks.mapstruct.example4.student.Address;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Address {
    private String street;
    private String community;
    private String department;
}
