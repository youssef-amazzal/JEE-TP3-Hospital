package youssef.amazzal.JEE_TP3_Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import youssef.amazzal.JEE_TP3_Hospital.entities.Patient;
import youssef.amazzal.JEE_TP3_Hospital.repository.PatientRepository;

import java.util.Date;

@SpringBootApplication
public class JeeTp3HospitalApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(JeeTp3HospitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patient p1 = Patient.builder().id(null).name("Youssef").birthDate(new Date()).sick(false).score(70).build();
		Patient p2 = Patient.builder().id(null).name("Omar").birthDate(new Date()).sick(true).score(43).build();
		Patient p3 = Patient.builder().id(null).name("Mouaad").birthDate(new Date()).sick(false).score(86).build();
		patientRepository.save(p1);
		patientRepository.save(p2);
		patientRepository.save(p3);
	}
}
