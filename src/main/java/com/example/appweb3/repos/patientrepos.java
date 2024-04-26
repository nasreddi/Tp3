package com.example.appweb3.repos;

import com.example.appweb3.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientrepos extends JpaRepository<Patient,Long> {

}
