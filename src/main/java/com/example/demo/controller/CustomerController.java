package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	CustomerService cse;
	
	@Autowired
	public CustomerController(CustomerService cse) {
		 this.cse = cse;
	}
	
	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer cust) {
		
		return cse.save(cust);
	}
	
	@PutMapping("/updata")
	public Customer updateCustomer(@RequestBody Customer cus) {
		return cse.save(cus);
		
	}
	
	@GetMapping("/findId/{cusid}")
	public Customer findById(@PathVariable int cusid) {
		return cse.findById(cusid);
	}
	
	@GetMapping("/findAll")
	public List<Customer> findAll(Customer cus) {
		return cse.findAll();
	}
	
	@DeleteMapping("/delete/{cusid}")
	public String delete(@PathVariable int cusid) {
		cse.delect(cusid);
		return "delete succefully";
	}

}
