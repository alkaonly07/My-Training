package com.Student.demo.controllerTest;


import com.Student.demo.controller.StudentController;
import com.Student.demo.entity.Student;
import com.Student.demo.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private StudentService studentService;

    @Test
    void testGetAllStudents() throws Exception {
        when(studentService.getAllStudents()).thenReturn(Arrays.asList(
                new Student(1L, "Alka Kumari", 25, 50000.0),
                new Student(2L, "Alka Kumari", 22, 60000.0)
        ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/students"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].name").value("Alka Kumari"))
                .andExpect(jsonPath("$[1].name").value("Alka Kumari"));

        verify(studentService, times(1)).getAllStudents();
    }

    @Test
    void testGetStudentById() throws Exception {
        Long studentId = 1L;
        when(studentService.getStudentById(studentId)).thenReturn(
                Optional.of(new Student(studentId, "Alka Kumari", 25, 50000.0))
        );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/students/{id}", studentId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name").value("Alka Kumari"));

        verify(studentService, times(1)).getStudentById(studentId);
    }

    @Test
    void testSaveStudent() throws Exception {
        Student newStudent = new Student(null, "Alka Kumari", 22, 60000.0);

        when(studentService.saveStudent(newStudent)).thenReturn(
                new Student(3L, "Alka Kumari", 22, 60000.0)
        );

        mockMvc.perform(MockMvcRequestBuilders.post("/api/students")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newStudent)))
                .andExpect(status().isOk());
                
    }

    @Test
    void testDeleteStudent() throws Exception {
        Long studentId = 3L;

        mockMvc.perform(MockMvcRequestBuilders.delete("/api/students/{id}", studentId))
                .andExpect(status().isOk());

        verify(studentService, times(1)).deleteStudent(studentId);
    }
}
