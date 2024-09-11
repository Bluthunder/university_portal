package com.example.UniversityPortal.services.impl;

import com.example.UniversityPortal.request.SaveStudentRequest;
import com.example.UniversityPortal.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final SaveStudentRequest saveStudentRequest;

    @Override
    public SaveStudentRequest saveStudent(SaveStudentRequest saveStudentRequest) {


        return saveStudentRequest;
    }
}
