package com.thoughtworks.mapstruct.example8;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    @Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MMM/yyyy")
    Patient toModel(PatientDto patientDto);

    PatientDto toDto(Patient patient);
}
