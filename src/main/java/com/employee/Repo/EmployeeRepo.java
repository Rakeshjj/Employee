package com.employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
