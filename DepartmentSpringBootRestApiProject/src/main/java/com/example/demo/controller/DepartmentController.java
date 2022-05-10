package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;



@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService deptservice;
	
	@PostMapping("/departments/")
	public Department saveDept(@RequestBody Department dept)
	{
		return deptservice.saveDept(dept);
		
	}
	@GetMapping("/departments/")
	public List<Department> fetchDepartment()
	{
		return deptservice.fetchdept();
	}
	
	@DeleteMapping("/department/{id}")
	public String delDepartmentbyId(@PathVariable("id") Long did)
	{
		deptservice.delEmployee(did);
		return "record is deleted";
		
	}

	
}
