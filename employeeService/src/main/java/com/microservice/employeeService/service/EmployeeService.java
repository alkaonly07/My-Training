package com.microservice.employeeService.service;

import com.microservice.employeeService.dto.APIResponseDto;

import com.microservice.employeeService.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
