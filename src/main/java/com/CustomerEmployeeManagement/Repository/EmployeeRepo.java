package com.CustomerEmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CustomerEmployeeManagement.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
