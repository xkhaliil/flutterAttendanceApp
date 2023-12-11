package net.ahmed.universitymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import net.ahmed.universitymanagement.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
