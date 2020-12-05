package com.thoughtworks.mapstruct.example0;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class uglyCode {
    @Test
    public void should_return_student_dto_when_use_get_and_set() {
        Student student = Student.builder()
                                 .age(10)
                                 .classroom("classroom")
                                 .gender("男")
                                 .hobbies(Arrays.asList("打篮球", "学习"))
                                 .id("xxx")
                                 .name("小刚")
                                 .teacher("王老师").build();

        StudentDto studentDto = new StudentDto();
        studentDto.setAge(student.getAge());
        studentDto.setClassroom(student.getClassroom());
        studentDto.setGender(student.getGender());
        studentDto.setHobbies(student.getHobbies());
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setTeacher(student.getTeacher());
        //...无穷无尽的get set

        Assert.assertEquals(student.getAge(), studentDto.getAge());
    }
}
