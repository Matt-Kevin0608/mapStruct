package com.thoughtworks.mapstruct.decorate;

import com.thoughtworks.mapstruct.decorate.repo.SchoolRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDecorateMapperTest {

    @Test
    public void should_return_student_given_student_entity() {
        SchoolRepository schoolRepository = new SchoolRepository();
        StudentEntity studentEntity = StudentEntity.builder().id(1L).name("name").schoolId(1L).build();
        Student student = StudentMapper.INSTANCE.toStudent(studentEntity);
        School school = schoolRepository.findById(studentEntity.getSchoolId());

        Assert.assertEquals(studentEntity.getId(), student.getId());
        Assert.assertEquals(school.getAddress(), student.getSchool().getAddress());
    }
}
