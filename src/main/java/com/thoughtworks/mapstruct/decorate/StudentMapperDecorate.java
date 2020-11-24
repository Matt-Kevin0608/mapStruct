package com.thoughtworks.mapstruct.decorate;

import com.thoughtworks.mapstruct.decorate.repo.SchoolRepository;

public class StudentMapperDecorate implements StudentMapper{

    private final StudentMapper delegate;

    public StudentMapperDecorate(StudentMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public Student toStudent(StudentEntity studentEntity) {
        SchoolRepository schoolRepository = new SchoolRepository();
        Student student = delegate.toStudent(studentEntity);
        School school = schoolRepository.findById(studentEntity.getSchoolId());
        student.setSchool(school);
        return student;
    }
}
