package com.Student.demo.repoTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.Student.demo.entity.Student;
import com.Student.demo.repository.StudentRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testSaveStudent() {
        Student student = new Student(null, "Alka Kumari", 25, 50000.0);
        studentRepository.save(student);

        assertEquals(1, studentRepository.count());
    }
}


