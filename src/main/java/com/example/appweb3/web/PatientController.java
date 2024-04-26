package com.example.appweb3.web;



import com.example.appweb3.entities.Patient;
import com.example.appweb3.repos.patientrepos;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private patientrepos repos;
    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patientlist = repos.findAll();
        model.addAttribute("listPatient",patientlist);
        return "patient";
    }
}
