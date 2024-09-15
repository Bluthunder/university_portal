package com.example.UniversityPortal.services;

import com.example.UniversityPortal.entity.StudentEntity;
import com.example.UniversityPortal.request.SaveStudentRequest;

public interface StudentService {

    StudentEntity saveStudent(SaveStudentRequest saveStudentRequest);


}
