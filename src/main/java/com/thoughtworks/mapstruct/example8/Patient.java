package com.thoughtworks.mapstruct.example8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {
    private int id;
    private String name;
    private String dateOfBirth;
}