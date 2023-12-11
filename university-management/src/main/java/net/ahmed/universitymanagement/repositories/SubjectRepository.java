package net.ahmed.universitymanagement.repositories;

import net.ahmed.universitymanagement.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {
}
