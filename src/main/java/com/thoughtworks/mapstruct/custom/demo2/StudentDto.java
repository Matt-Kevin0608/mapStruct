package com.thoughtworks.mapstruct.custom.demo2;

import lombok.Builder;

import java.time.Instant;

@Builder
public class StudentDto {
    private String id;
    private String name;
    private Instant happyTime;
}
