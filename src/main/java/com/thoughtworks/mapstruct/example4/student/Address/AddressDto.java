package com.thoughtworks.mapstruct.example4.student.Address;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AddressDto {
    private String streetName;
    private String communityName;
    private String departmentName;
}
