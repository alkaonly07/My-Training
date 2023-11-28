package com.microservice.employeeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.employeeService.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
