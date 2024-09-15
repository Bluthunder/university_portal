package com.example.UniversityPortal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Table(name="student_info")
@Entity
@Data
public class StudentEntity {

    @Column(name="st_roll_number")
    private Integer rollNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STD_INFO_SEQ")
    @SequenceGenerator(name = "STD_INFO_SEQ", sequenceName = "public.STD_INFO_SEQ", allocationSize = 1)
    @Column(name="st_id")
    private Integer stdID;

    @Column(name="st_name")
    private String stdName;

    @Column(name="st_email")
    private String stdEmail;

    @Column(name="st_phone_number")
    private String stdPhoneNumber;

    @Override
    public String toString() {
        return "StudentEntity {" +
                "rollNumber=" + rollNumber +
                ", stdID=" + stdID +
                ", stdName='" + stdName + '\'' +
                ", stdEmail='" + stdEmail + '\'' +
                ", stdPhoneNumber='" + stdPhoneNumber + '\'' +
                '}';
    }
}
