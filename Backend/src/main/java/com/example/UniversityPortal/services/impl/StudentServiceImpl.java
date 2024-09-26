package com.example.UniversityPortal.services.impl;

import com.example.UniversityPortal.entity.StudentEntity;
import com.example.UniversityPortal.repository.StudentRepository;
import com.example.UniversityPortal.request.SaveStudentRequest;
import com.example.UniversityPortal.services.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    @Transactional
    public StudentEntity saveStudent(SaveStudentRequest saveStudentRequest) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStdID(saveStudentRequest.getStdID());
        studentEntity.setStdName(saveStudentRequest.getStdFirstName() + " " + saveStudentRequest.getStdLastName());
        studentEntity.setRollNumber(saveStudentRequest.getRollNumber());
        studentEntity.setStdEmail(saveStudentRequest.getStdEmail());
        studentEntity.setStdPhoneNumber(saveStudentRequest.getStdPhoneNumber());
        return studentRepository.save(studentEntity);
    }

    @Override
    @Transactional
    public StudentEntity fetchStudent(Integer rollNumber) {

        return studentRepository.findByRollNumber(rollNumber);

    }


}
