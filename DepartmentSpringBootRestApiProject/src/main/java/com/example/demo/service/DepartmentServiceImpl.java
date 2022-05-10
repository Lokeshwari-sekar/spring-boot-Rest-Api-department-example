package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository deptrepo;
	@Override
	public Department saveDept(Department dept) {
		
		return deptrepo.save(dept) ;
	}
	@Override
	public List<Department> fetchdept() {
		// TODO Auto-generated method stub
		return deptrepo.findAll();
	}
	@Override
	public void delEmployee(long did) {
		deptrepo.deleteById(did);
		
	}
	

}
