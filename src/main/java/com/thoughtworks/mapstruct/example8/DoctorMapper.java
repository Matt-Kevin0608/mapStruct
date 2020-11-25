package com.thoughtworks.mapstruct.example8;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PatientMapper.class, Validator.class})
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mapping(source = "doctor.patientList", target = "patientDtoList")
    @Mapping(source = "doctor.specialty", target = "specialization")
    DoctorDto toDto(Doctor doctor) throws ValidationException;
}
