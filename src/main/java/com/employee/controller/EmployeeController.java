package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Dto.Employee;
import com.employee.service.ServiceInterface;

@RestController
public class EmployeeController {

	@Autowired
	private ServiceInterface serviceInterface;

	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Employee employee) {
		String message="";
		try {
			serviceInterface.save(employee);
			message="Data saved";
			return new ResponseEntity<String>(message, HttpStatus.OK);
		} catch (Exception e) {
			message="Data does not save";
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}

	}
}
