package com.example.UniversityPortal.request;


import lombok.Data;

@Data
public class SaveStudentRequest {

    private Integer rollNumber;
    private Integer stdID;
    private String stdFirstName;
    private String stdLastName;
    private String stdEmail;
    private String stdPhoneNumber;

}
