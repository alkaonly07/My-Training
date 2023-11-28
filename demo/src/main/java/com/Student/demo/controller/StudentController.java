package com.Student.demo.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Student.demo.entity.Student;
import com.Student.demo.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        logger.info("Fetching all students");
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        logger.info("Fetching student with ID: {}", id);
        return studentService.getStudentById(id)
                .orElseThrow(() -> {
                    logger.warn("Student not found with ID: {}", id);
                    return new RuntimeException("Student not found with id: " + id);
                });
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        logger.info("Saving new student: {}", student.getName());
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        logger.info("Deleting student with ID: {}", id);
        studentService.deleteStudent(id);
    }
}
