package com.CustomerEmployeeManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerEmployeeManagement.Model.Customer;
import com.CustomerEmployeeManagement.Repository.CustomerRepo;

@Service
public class CustomerService {

	
	private final CustomerRepo customerRepo;
	
	@Autowired
	public CustomerService(CustomerRepo customerRepo) {
	this.customerRepo= customerRepo;
	}
	
	public Customer createCustomer(Customer customer)
	{
		return  customerRepo.save(customer);
	}
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}

	public Optional<Customer> getCustomerById(Long id) {
		return customerRepo.findById(id);
	}

	public void deleteCustomer(Long id) {
		customerRepo.deleteById(id);
	}
}
