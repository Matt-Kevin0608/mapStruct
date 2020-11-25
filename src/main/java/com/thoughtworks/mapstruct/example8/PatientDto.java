package com.thoughtworks.mapstruct.example8;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PatientDto {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
}
