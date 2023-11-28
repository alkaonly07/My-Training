package com.microservice.departmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.departmentService.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
