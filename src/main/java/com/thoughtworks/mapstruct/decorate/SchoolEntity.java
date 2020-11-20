package com.thoughtworks.mapstruct.decorate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SchoolEntity {
    private Long id;

    private String name;

    private String address;
}
