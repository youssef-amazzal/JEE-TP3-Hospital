package youssef.amazzal.JEE_TP3_Hospital.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import youssef.amazzal.JEE_TP3_Hospital.entities.Patient;
import youssef.amazzal.JEE_TP3_Hospital.repository.PatientRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private final PatientRepository repository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Patient> list = repository.findAll();
        model.addAttribute("list", list);
        return "patients";
    }
}
