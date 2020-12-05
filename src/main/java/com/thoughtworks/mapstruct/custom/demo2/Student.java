package com.thoughtworks.mapstruct.custom.demo2;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Builder
@Getter
public class Student {
    private String id;
    private String name;
    private Instant happyTime;
}
