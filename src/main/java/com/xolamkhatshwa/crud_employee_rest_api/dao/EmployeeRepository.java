package com.xolamkhatshwa.crud_employee_rest_api.dao;

import com.xolamkhatshwa.crud_employee_rest_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
