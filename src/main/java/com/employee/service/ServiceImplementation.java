package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Dto.Employee;
import com.employee.Repo.EmployeeRepo;

@Service
public class ServiceImplementation implements ServiceInterface {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee save(Employee employee) {
		int employee2 = employee.getId();
		if (employee2 != 0) {
			 employeeRepo.save(employee);
		}
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
