package com.example.UniversityPortal.services;

import com.example.UniversityPortal.entity.StudentEntity;
import com.example.UniversityPortal.repository.StudentRepository;
import com.example.UniversityPortal.request.SaveStudentRequest;

public interface IStudentService {

    StudentEntity saveStudent(SaveStudentRequest saveStudentRequest);

    StudentEntity fetchStudent(Integer rollNumber);

}
