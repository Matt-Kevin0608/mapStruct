package com.thoughtworks.mapstruct.example8;

import org.junit.Test;

public class DoctorMapperTest {

    @Test(expected = ValidationException.class)
    public void should_throw_validation_exception_when_id_is_minus_one() {
        Doctor doctor = Doctor.builder().id(-1).name("医生").build();
        DoctorMapper.INSTANCE.toDto(doctor);
    }
}
