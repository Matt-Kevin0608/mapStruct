package com.thoughtworks.mapstruct.decorate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class StudentEntity {
    private Long id;

    private String name;

    private Long schoolId;
}
