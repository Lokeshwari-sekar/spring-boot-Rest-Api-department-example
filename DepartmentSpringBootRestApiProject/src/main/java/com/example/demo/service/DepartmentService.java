package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {

	Department saveDept(Department dept);

	List<Department> fetchdept();



	void delEmployee(long did);

	

	

}
