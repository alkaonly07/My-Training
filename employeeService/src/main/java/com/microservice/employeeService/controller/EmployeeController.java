package com.microservice.employeeService.controller;

import lombok.AllArgsConstructor;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservice.employeeService.dto.APIResponseDto;
import com.microservice.employeeService.dto.EmployeeDto;
import com.microservice.employeeService.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Save Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){
        APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
