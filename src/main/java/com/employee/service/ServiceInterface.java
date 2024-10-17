package com.employee.service;

import java.util.List;

import com.employee.Dto.Employee;

public interface ServiceInterface {

	public Employee save(Employee employee);

	public List<Employee> getAll();

	public Employee getById(int id);

	public void delete(int id);
}
