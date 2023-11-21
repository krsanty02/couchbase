package com.couchbase.controller;

import com.couchbase.model.Customer;
import com.couchbase.model.Employee;
import com.couchbase.repo.CustomerRepo;
import com.couchbase.repo.EmployeeRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepo repo;

	@Autowired
	private EmployeeRepo empRepo;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		System.out.println("Vale of customer request" + customer);
		repo.save(customer);
		return new ResponseEntity<String>("Customer saved successfully", HttpStatus.CREATED);
	}
	@PostMapping("/saveEmp")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {
		System.out.println("Vale of Employee request" + emp);
		empRepo.save(emp);
		return new ResponseEntity<String>("Customer saved successfully", HttpStatus.CREATED);
	}
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable int id) {
		Customer customer = repo.findById(id).get();
		return new ResponseEntity<Customer>(customer, HttpStatus.ACCEPTED);
	}
	@GetMapping("/getEmp/{id}")
	public ResponseEntity<List<Employee>> getEmployee(@PathVariable String id) {
		List<Employee> emp =  empRepo.findAll();
		return new ResponseEntity<List<Employee>>(emp, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/check")
	public String hello() {
		return "hello";
	}
}
