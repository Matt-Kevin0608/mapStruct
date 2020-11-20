package com.thoughtworks.mapstruct.decorate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class School {
    private Long id;

    private String name;

    private String address;
}
