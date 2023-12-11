package net.ahmed.universitymanagement.web;

import net.ahmed.universitymanagement.entities.Student;
import net.ahmed.universitymanagement.entities.Subject;
import net.ahmed.universitymanagement.repositories.AttendanceRepository;
import net.ahmed.universitymanagement.repositories.StudentRepository;
import net.ahmed.universitymanagement.repositories.SubjectRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import net.ahmed.universitymanagement.entities.Attendance;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AttendanceRestController {
    private final AttendanceRepository attendanceRepository;
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;

    public AttendanceRestController(AttendanceRepository attendanceRepository, StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.attendanceRepository = attendanceRepository;
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    @PostMapping("/attendances/create")
    public Attendance createAttendance(@RequestBody Attendance newAttendance) {
        return attendanceRepository.save(newAttendance);
    }

    @GetMapping("/attendances/{studentId}")
    public List<Attendance> getAttendanceByStudentId(@PathVariable("studentId") String studentId) {
        Student existingStudent = studentRepository.findById(studentId).get();
        return attendanceRepository.findByStudent(existingStudent);
    }

    @GetMapping("/attendances/{studentId}/total")
    public Double getTotalHoursByStudentId(@PathVariable("studentId") String studentId) {
        System.out.println("studentId: " + studentId);
        Student existingStudent = studentRepository.findById(studentId).get();
        List<Attendance> attendances = attendanceRepository.findByStudent(existingStudent);
        Double totalHours = 0.0;
        for (Attendance attendance : attendances) {
            totalHours += attendance.getNumberOfHours();
        }
        return totalHours;
    }
}
