package net.ahmed.universitymanagement.repositories;

import net.ahmed.universitymanagement.entities.Attendance;
import net.ahmed.universitymanagement.entities.Student;
import net.ahmed.universitymanagement.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, String> {
    List<Attendance> findByStudent(Student student);
    List<Attendance> findByStudentAndSubject(Student student, Subject subject);
}
