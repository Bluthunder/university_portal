package com.example.UniversityPortal.repository;

import com.example.UniversityPortal.entity.StudentEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    @Override
    @NotNull
    Optional<StudentEntity> findById(Integer stdID);

}
