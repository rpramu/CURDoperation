package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
	
	public Customer save(Customer customer);
	public Customer update(Customer customer);
	public Customer findById(int id);
	public List<Customer> findAll();
	public void delect(int id);

}
