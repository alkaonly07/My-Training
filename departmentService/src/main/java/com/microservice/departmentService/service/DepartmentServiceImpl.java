package com.microservice.departmentService.service;

import org.springframework.stereotype.Service;

import com.microservice.departmentService.dto.DepartmentDto;
import com.microservice.departmentService.entity.Department;
import com.microservice.departmentService.mapper.DepartmentMapper;
import com.microservice.departmentService.repository.DepartmentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        return DepartmentMapper.mapToDepartmentDto(department);
    }
}
