package com.thoughtworks.mapstruct.deepCopy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Student {
    private Attribute attribute;
}
