package com.thoughtworks.mapstruct.example8;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class DoctorDto {
    private int id;
    private String name;
    private String externalId;
    private String specialization;
    private LocalDateTime availability;
    private List<PatientDto> patientDtoList;
}
