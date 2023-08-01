package com.example.Dosify.repository;

import com.example.Dosify.model.Doctor;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepositoryImplementation<Doctor,Integer> {
}
