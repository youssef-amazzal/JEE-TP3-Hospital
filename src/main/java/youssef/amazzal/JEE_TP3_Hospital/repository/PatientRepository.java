package youssef.amazzal.JEE_TP3_Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import youssef.amazzal.JEE_TP3_Hospital.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
