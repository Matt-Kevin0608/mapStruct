package com.thoughtworks.mapstruct.student;

import com.thoughtworks.mapstruct.student.Address.Address;
import com.thoughtworks.mapstruct.student.GenderEum.GenderEnum;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class StudentMapperTest {

    @Test
    public void studentTest() {
        Student student = Student.builder()
                .address(Address.builder().community("电子城社区").department("春天花园").street("电子街").build())
                .gender(GenderEnum.FEMALE).id(2001L).name("晓丽").birthday(Instant.now()).build();
        StudentDto studentDto = StudentMapper.INSTANCE.toDto(student);
        Assert.assertEquals(student.getGender().name(), studentDto.getGender());
        Assert.assertEquals(student.getAddress().getCommunity(), studentDto.getAddress().getCommunityName());
        Assert.assertEquals(student.getAddress().getDepartment(), studentDto.getAddress().getDepartmentName());
        Assert.assertEquals(student.getAddress().getStreet(), studentDto.getAddress().getStreetName());
        Assert.assertEquals(student.getBirthday().toEpochMilli(), studentDto.getBirthday());
    }
}
