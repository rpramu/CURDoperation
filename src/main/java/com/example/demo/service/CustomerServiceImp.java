package com.example.demo.service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CustomerRep;
import com.example.demo.entity.Customer;

@Service
public class CustomerServiceImp implements CustomerService {
	
	CustomerRep ref;
	
	@Autowired
	public CustomerServiceImp(CustomerRep ref) {
		
		this.ref = ref;
		
	}

	//Create
	@Override
	@Transactional
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return ref.save(customer);
	}

	@Override
	@Transactional
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return ref.save(customer);
	}

	@Override
	@Transactional
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> cu = ref.findById(id);
		Customer i = cu.get();
		return i;
	}

	@Override
	@Transactional
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return ref.findAll();
	}

	@Override
	@Transactional
	public void delect(int id) {
		// TODO Auto-generated method stub
		ref.deleteById(id);
	}

}
