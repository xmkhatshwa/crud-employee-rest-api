package com.xolamkhatshwa.crud_employee_rest_api.dao;

import com.xolamkhatshwa.crud_employee_rest_api.entity.Employee;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

@Tag(name = "Employees REST API Endpoints", description = "Operations Related to employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
