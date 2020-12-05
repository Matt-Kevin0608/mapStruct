package com.thoughtworks.mapstruct.custom;

import com.thoughtworks.mapstruct.custom.demo3.Student;
import com.thoughtworks.mapstruct.custom.demo3.StudentDto;
import com.thoughtworks.mapstruct.custom.demo3.StudentMapper;
import org.junit.Assert;
import org.junit.Test;

public class Demo3Test {

    @Test
    public void should_return_updated_studentDto() {
        Student student = new Student("name", null);
        StudentDto studentDto = StudentMapper.INSTANCE.toStudentDto(student);
        Assert.assertEquals(studentDto.getName(), student.getName().toUpperCase());
        Assert.assertEquals(studentDto.getHobbies().size(), 1);
        Assert.assertEquals(studentDto.getHobbies().get(0), "none");
    }
}
