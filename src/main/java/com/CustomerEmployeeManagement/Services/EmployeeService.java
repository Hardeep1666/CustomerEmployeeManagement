package com.CustomerEmployeeManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerEmployeeManagement.Model.Employee;
import com.CustomerEmployeeManagement.Repository.EmployeeRepo;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo)
	{
		this.employeeRepo=employeeRepo;
	}
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepo.findById(id);
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}
	
}
