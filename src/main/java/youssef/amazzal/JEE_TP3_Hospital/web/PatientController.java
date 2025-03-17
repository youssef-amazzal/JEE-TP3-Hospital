package youssef.amazzal.JEE_TP3_Hospital.web;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import youssef.amazzal.JEE_TP3_Hospital.entities.Patient;
import youssef.amazzal.JEE_TP3_Hospital.repository.PatientRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private final PatientRepository repository;

    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "page" , defaultValue = "0") int page,
                        @RequestParam(name = "size" , defaultValue = "1") int size
    ) {
        Page<Patient> patients = repository.findAll(PageRequest.of(page, size));
        model.addAttribute("patients", patients.getContent());
        model.addAttribute("pages", new int[patients.getTotalPages()]);
        return "patients";
    }
}
