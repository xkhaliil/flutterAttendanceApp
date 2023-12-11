package net.ahmed.universitymanagement;

import net.ahmed.universitymanagement.entities.Class;
import net.ahmed.universitymanagement.entities.Department;
import net.ahmed.universitymanagement.entities.Student;
import net.ahmed.universitymanagement.repositories.ClassRepository;
import net.ahmed.universitymanagement.repositories.DepartmentRepository;
import net.ahmed.universitymanagement.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class UniversityManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityManagementApplication.class, args);
	}
}
