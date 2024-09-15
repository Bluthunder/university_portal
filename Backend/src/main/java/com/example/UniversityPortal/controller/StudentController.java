package com.example.UniversityPortal.controller;


import com.example.UniversityPortal.entity.StudentEntity;
import com.example.UniversityPortal.request.SaveStudentRequest;
import com.example.UniversityPortal.services.StudentService;
import com.example.UniversityPortal.services.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/student")
@Validated
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentEntity registerStudent(@RequestBody @Valid SaveStudentRequest saveStudentRequest){
        return studentService.saveStudent(saveStudentRequest);
   }
}
