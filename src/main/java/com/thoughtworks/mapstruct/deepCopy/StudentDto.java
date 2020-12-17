package com.thoughtworks.mapstruct.deepCopy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class StudentDto {
    private Attribute attribute;
}
