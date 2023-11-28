package com.microservice.departmentService.service;

import com.microservice.departmentService.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);
}
