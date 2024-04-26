package com.example.appweb3;

import com.example.appweb3.entities.Patient;
import com.example.appweb3.repos.patientrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Appweb3Application implements CommandLineRunner {
    @Autowired
    private patientrepos repos;
    public static void main(String[] args) {

        SpringApplication.run(Appweb3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient patient=new Patient();
        patient.setId(null);
        patient.setNom("naser");
        patient.setDateNaissance(new Date());
        patient.setMalade(true);
        patient.setScore(45);

        Patient patient1=new Patient(null,"aziz",new Date(),false,21);
       repos.save(patient1);
       repos.save(patient);
       repos.save(new Patient(null,"said",new Date(),true,91));

    }
}
