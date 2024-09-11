package com.example.UniversityPortal.controller;


import com.example.UniversityPortal.request.SaveStudentRequest;
import com.example.UniversityPortal.services.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/student")
@Validated
public class StudentController {

    private final StudentServiceImpl studentServiceImpl;
    

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public SaveStudentRequest registerStudent(@RequestBody @Valid SaveStudentRequest saveStudentRequest){

        return studentServiceImpl.saveStudent(saveStudentRequest);
   }
}
