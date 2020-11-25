package com.thoughtworks.mapstruct.example8;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public class Doctor {
    private int id;
    private String name;
    private String externalId;
    private String specialty;
    private LocalDateTime availability;
    private List<Patient> patientList;
}